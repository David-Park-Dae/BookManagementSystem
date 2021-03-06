import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class mainFrame extends JFrame {

	private JPanel contentPane;
	Toolkit tk = Toolkit.getDefaultToolkit();
	JFileChooser fileChooser = new JFileChooser();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame("BookManagementSystem Version 1.0");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public mainFrame(String title) {
		// 제일 처음 실행 되는 Frame의 GUI
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1700, 1000);
		setLocation((tk.getScreenSize().width - getWidth()) / 2, (tk.getScreenSize().height - getHeight()) / 2);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[933.00px,grow][589px]", "[47px][479px,grow]"));

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu file_Menu = new JMenu("File");
		menuBar.add(file_Menu);

		JMenuItem open_Menu = new JMenuItem("Open DataBase");
		file_Menu.add(open_Menu);

		// 여기 더 구현해야 함 메뉴 부분
		open_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setCurrentDirectory(new File("D:\\"));
				int result = fileChooser.showOpenDialog(contentPane);
			}
		});

		JMenuItem refresh_Menu = new JMenuItem("Refresh");
		file_Menu.add(refresh_Menu);

		JMenuItem exit_Menu = new JMenuItem("Exit");
		file_Menu.add(exit_Menu);
		exit_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		/////////////////////// filechooser button 만들어서 listener 안에 넣으면 됨

		JPanel name_Panel = new JPanel();
		name_Panel.setLayout(null);
		name_Panel.setBounds(100, 100, 200, 200);
		contentPane.add(name_Panel, "cell 0 0,grow");

		JLabel label = new JLabel("도서관리프로그램");
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 28));
		label.setBounds(0, 0, 611, 47);
		name_Panel.add(label);

		JPanel ad_Panel = new JPanel();
		ad_Panel.setLayout(null);
		contentPane.add(ad_Panel, "cell 1 0,grow");

		// 여기서 부터는 만든 tab들을 생성해서 붙임
		// 이건 왼쪽 도서현황 회원현황 패널 생성
		tabPanel_Left tabpL = new tabPanel_Left("");
		// 이건 오른쪽에 정보열람 tab 생성
		tabPanel_Right tabpR = new tabPanel_Right("");

		// 나중에 아래 버튼에 리스너 추가
		refresh_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == refresh_Menu) {
					refresh_Menu.setSelected(false);
					Vector title_Book = new Vector();
					Vector data_Book = new Vector();
					title_Book.add("도서번호");
					title_Book.add("도서명");
					title_Book.add("저자");
					title_Book.add("출판사");

					DefaultTableModel model_Book = new DefaultTableModel() {
						public boolean isCellEditable(int row, int column) {
							if (column >= 0) {
								return false;
							} else {
								return true;
							}
						}
					};
					tabpL.book_table.setModel(model_Book);

					readExcel readEx = new readExcel();
					data_Book = readEx.getVector();

					// JTable에 붙임
					model_Book.setDataVector(data_Book, title_Book);
					tabpL.scrollPane_Book.setViewportView(tabpL.book_table);

				}

			}

		});

		// 최상위 Panel에 생성 한거 가져다 붙임
		contentPane.add(tabpL.getPanel(), "cell 0 1,grow");
		contentPane.add(tabpR.getPanel(), "cell 1 1,grow");
	}
}
