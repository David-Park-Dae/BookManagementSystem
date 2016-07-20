import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;

import net.miginfocom.swing.MigLayout;

public class tabbedPanel_Right_bookMngt extends JTabbedPane {
	private JTabbedPane tabbedPane;
	private static JTextField tf_memNum;
	private static JTextField tf_telNum;
	private static JTextField tf_memName;
	private JPanel mem_Info;
	private JPanel book_Info;
	private JPanel book_Mngt;
	private JPanel inner_bookMngt;
	private JTextPane tp_bookInfo;
	private JTextPane tp_memInfo;
	private JTextPane tp_memNum;
	private JTextPane tp_memName;
	private JTextPane tp_telNum;
	private JTextPane tp_Memo_Up;
	private JScrollPane scrollPane_Up;
	private JTextArea ta_Memo_Up;
	private JTextPane tp_bookNum;
	private static JTextField tf_bookNum;
	private JTextPane tp_bookName;
	private static JTextField tf_bookName;
	private JTextPane tp_Author;
	private static JTextField tf_Author;
	private JTextPane tp_Pub;
	private static JTextField tf_Pub;
	private JTextPane tp_Memo_Down;
	private JScrollPane scrollPane_Down;
	private static JTextArea ta_Memo_Down;
	private JPanel blank;

	public tabbedPanel_Right_bookMngt(String title) {
		init(title);
	}

	public tabbedPanel_Right_bookMngt() {

	}

	public void init(String title) {
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		book_Mngt = new JPanel();
		tabbedPane.addTab(title, null, book_Mngt, null);
		book_Mngt.setLayout(new MigLayout("", "[grow]", "[571.00,grow][232.00,grow]"));

		inner_bookMngt = new JPanel();
		inner_bookMngt.setBackground(Color.WHITE);
		inner_bookMngt.setLayout(null);
		book_Mngt.add(inner_bookMngt, "cell 0 0,grow");

		tp_memInfo = new JTextPane();
		tp_memInfo.setEditable(false);
		tp_memInfo.setFont(new Font("����", Font.PLAIN, 14));
		tp_memInfo.setText("ȸ������");
		tp_memInfo.setBounds(24, 10, 62, 23);
		inner_bookMngt.add(tp_memInfo);

		tp_bookInfo = new JTextPane();
		tp_bookInfo.setEditable(false);
		tp_bookInfo.setBounds(24, 280, 62, 23);
		tp_bookInfo.setText("��������");
		tp_bookInfo.setFont(new Font("����", Font.PLAIN, 14));
		inner_bookMngt.add(tp_bookInfo);

		mem_Info = new JPanel();
		mem_Info.setBackground(Color.WHITE);
		mem_Info.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		mem_Info.setBounds(12, 24, 548, 249);
		mem_Info.setLayout(null);
		inner_bookMngt.add(mem_Info);
		///////////////////////////////////// ȸ����ȣ
		tp_memNum = new JTextPane();
		tp_memNum.setEditable(false);
		tp_memNum.setText("ȸ����ȣ");
		tp_memNum.setBounds(12, 32, 54, 21);
		mem_Info.add(tp_memNum);

		tf_memNum = new JTextField();
		tf_memNum.setEditable(false);
		tf_memNum.setBounds(79, 32, 187, 21);
		tf_memNum.setColumns(10);
		mem_Info.add(tf_memNum);
		/////////////////////////////////////// ȸ���̸�
		tp_memName = new JTextPane();
		tp_memName.setEditable(false);
		tp_memName.setText("ȸ����");
		tp_memName.setBounds(280, 32, 42, 21);
		mem_Info.add(tp_memName);

		tf_memName = new JTextField();
		tf_memName.setEditable(false);
		tf_memName.setColumns(10);
		tf_memName.setBounds(334, 32, 187, 21);
		mem_Info.add(tf_memName);
		/////////////////////////////////////// ȸ����
		tp_telNum = new JTextPane();
		tp_telNum.setEditable(false);
		tp_telNum.setText("��ȭ��ȣ");
		tp_telNum.setBounds(12, 63, 54, 21);
		mem_Info.add(tp_telNum);

		tf_telNum = new JTextField();
		tf_telNum.setEditable(false);
		tf_telNum.setColumns(10);
		tf_telNum.setBounds(79, 63, 187, 21);
		mem_Info.add(tf_telNum);
		/////////////////////////////////////// ��ȭ��ȣ
		tp_Memo_Up = new JTextPane();
		tp_Memo_Up.setEditable(false);
		tp_Memo_Up.setText("��      ��");
		tp_Memo_Up.setBounds(12, 96, 54, 21);
		mem_Info.add(tp_Memo_Up);

		scrollPane_Up = new JScrollPane();
		scrollPane_Up.setBounds(79, 98, 443, 137);
		mem_Info.add(scrollPane_Up);

		ta_Memo_Up = new JTextArea();
		ta_Memo_Up.setEditable(false);
		scrollPane_Up.setViewportView(ta_Memo_Up);
		//////////////////////////////////// �޸�
		book_Info = new JPanel();
		book_Info.setBackground(Color.WHITE);
		book_Info.setLayout(null);
		book_Info.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		book_Info.setBounds(12, 292, 548, 237);
		inner_bookMngt.add(book_Info);
		//////////////////////////////////// ȸ������ ��

		tp_bookNum = new JTextPane();
		tp_bookNum.setEditable(false);
		tp_bookNum.setText("������ȣ");
		tp_bookNum.setBounds(12, 24, 54, 21);
		book_Info.add(tp_bookNum);

		tf_bookNum = new JTextField();
		tf_bookNum.setEditable(false);
		tf_bookNum.setColumns(10);
		tf_bookNum.setBounds(79, 24, 187, 21);
		book_Info.add(tf_bookNum);
		////////////////////////////////////////
		tp_bookName = new JTextPane();
		tp_bookName.setEditable(false);
		tp_bookName.setText("������");
		tp_bookName.setBounds(280, 24, 42, 21);
		book_Info.add(tp_bookName);

		tf_bookName = new JTextField();
		tf_bookName.setEditable(false);
		tf_bookName.setColumns(10);
		tf_bookName.setBounds(334, 24, 187, 21);
		book_Info.add(tf_bookName);
		///////////////////////////////////////////
		tp_Author = new JTextPane();
		tp_Author.setEditable(false);
		tp_Author.setText("����");
		tp_Author.setBounds(12, 55, 54, 21);
		book_Info.add(tp_Author);

		tf_Author = new JTextField();
		tf_Author.setEditable(false);
		tf_Author.setColumns(10);
		tf_Author.setBounds(79, 55, 187, 21);
		book_Info.add(tf_Author);
		/////////////////////////////////////////
		tp_Pub = new JTextPane();
		tp_Pub.setEditable(false);
		tp_Pub.setText("���ǻ�");
		tp_Pub.setBounds(280, 55, 42, 21);
		book_Info.add(tp_Pub);

		tf_Pub = new JTextField();
		tf_Pub.setEditable(false);
		tf_Pub.setColumns(10);
		tf_Pub.setBounds(334, 55, 187, 21);
		book_Info.add(tf_Pub);
		/////////////////////////////////////////////////////
		tp_Memo_Down = new JTextPane();
		tp_Memo_Down.setEditable(false);
		tp_Memo_Down.setText("��      ��");
		tp_Memo_Down.setBounds(12, 86, 54, 21);
		book_Info.add(tp_Memo_Down);

		scrollPane_Down = new JScrollPane();
		scrollPane_Down.setBounds(79, 88, 443, 137);
		book_Info.add(scrollPane_Down);

		ta_Memo_Down = new JTextArea();
		ta_Memo_Down.setEditable(false);
		scrollPane_Down.setViewportView(ta_Memo_Down);

		///////////////////////////////// �������� ��
		blank = new JPanel();
		blank.setLayout(null);
		book_Mngt.add(blank, "cell 0 1,grow");
		/////////////////////////////////// �������� ��

		tabbedPanel_Right_memMngt tabpR_mM = new tabbedPanel_Right_memMngt();
		tabbedPane.add(tabpR_mM.getPanel(), "ȸ������");
	}

	public void setBookTextField(int num, String name, String author, String pub) {
		tf_bookNum.setText(Integer.toString(num));
		tf_bookName.setText(name);
		tf_Author.setText(author);
		tf_Pub.setText(pub);
	}

	public void setMemTextField(int num, String name, String tel) {
		tf_memNum.setText(Integer.toString(num));
		tf_memName.setText(name);
		tf_telNum.setText(tel);
	}

	public JTabbedPane getPanel() {
		return tabbedPane;
	}
}
