import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class zz extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zz frame = new zz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public zz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1700, 1000);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);

		JMenuItem menuItem = new JMenuItem("New menu item");
		mnNewMenu_1.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[312.00px,grow][589px]", "[47px][479px,grow]"));

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(100, 100, 200, 200);
		contentPane.add(panel, "cell 0 0,grow");

		JLabel label = new JLabel(" �����������α׷�");
		label.setFont(new Font("�޸յձ�������", Font.PLAIN, 28));
		label.setBounds(0, 0, 611, 47);
		panel.add(label);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		contentPane.add(panel_2, "cell 1 0,grow");

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane_1, "cell 0 1,grow");

		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane_1.addTab("������Ȳ", null, scrollPane_1, null);

		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "", "", "", "" }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "\uB3C4\uC11C\uBC88\uD638", "\uB3C4\uC11C\uBA85", "\uC800\uC790",
						"\uCD9C\uD310\uC0AC" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);

		JScrollPane scrollPane = new JScrollPane();
		tabbedPane_1.addTab("ȸ����Ȳ", null, scrollPane, null);

		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(
				new DefaultTableModel(new Object[][] { { "", "", "", "", null }, { null, null, null, null, null },

						{ null, null, null, null, null }, },
						new String[] { "\uD68C\uC6D0\uBC88\uD638", "\uD68C\uC6D0\uBA85", "\uC804\uD654\uBC88\uD638",
								"\uC8FC\uC18C", "\uC774\uBA54\uC77C" }));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(90);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(90);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(90);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(90);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(90);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 1 1,grow");

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("��������", null, panel_4, null);
		panel_4.setLayout(new MigLayout("", "[grow]", "[571.00,grow][232.00,grow]"));

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_4.add(panel_7, "cell 0 0,grow");
		panel_7.setLayout(null);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("����", Font.PLAIN, 14));
		textPane.setText("ȸ������");
		textPane.setBounds(24, 10, 62, 23);
		panel_7.add(textPane);

		JTextPane textPane_13 = new JTextPane();
		textPane_13.setBounds(24, 280, 62, 23);
		panel_7.add(textPane_13);
		textPane_13.setText("��������");
		textPane_13.setFont(new Font("����", Font.PLAIN, 14));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8.setBounds(12, 22, 548, 249);
		panel_7.add(panel_8);
		panel_8.setLayout(null);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("ȸ����ȣ");
		textPane_2.setBounds(12, 32, 54, 21);
		panel_8.add(textPane_2);

		textField = new JTextField();
		textField.setBounds(79, 32, 187, 21);
		panel_8.add(textField);
		textField.setColumns(10);

		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("ȸ����");
		textPane_3.setBounds(280, 32, 42, 21);
		panel_8.add(textPane_3);

		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("��ȭ��ȣ");
		textPane_4.setBounds(12, 63, 54, 21);
		panel_8.add(textPane_4);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 63, 187, 21);
		panel_8.add(textField_2);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("��      ��");
		textPane_1.setBounds(12, 96, 54, 21);
		panel_8.add(textPane_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(334, 32, 187, 21);
		panel_8.add(textField_6);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(79, 98, 443, 137);
		panel_8.add(scrollPane_2);

		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_9.setBounds(12, 292, 548, 237);
		panel_7.add(panel_9);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(79, 88, 443, 137);
		panel_9.add(scrollPane_3);

		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("��      ��");
		textPane_7.setBounds(12, 86, 54, 21);
		panel_9.add(textPane_7);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(79, 55, 187, 21);
		panel_9.add(textField_5);

		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("����");
		textPane_9.setBounds(12, 55, 54, 21);
		panel_9.add(textPane_9);

		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText("������ȣ");
		textPane_10.setBounds(12, 24, 54, 21);
		panel_9.add(textPane_10);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(79, 24, 187, 21);
		panel_9.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(334, 24, 187, 21);
		panel_9.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(334, 55, 187, 21);
		panel_9.add(textField_9);

		JTextPane textPane_11 = new JTextPane();
		textPane_11.setText("���ǻ�");
		textPane_11.setBounds(280, 55, 42, 21);
		panel_9.add(textPane_11);

		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText("������");
		textPane_12.setBounds(280, 24, 42, 21);
		panel_9.add(textPane_12);

		JPanel panel_1 = new JPanel();
		panel_4.add(panel_1, "cell 0 1,grow");
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("ȸ������", null, panel_3, null);
		panel_3.setLayout(new MigLayout("", "[grow]", "[524.00,grow][grow]"));

		JPanel panel_11 = new JPanel();
		panel_3.add(panel_11, "cell 0 0,grow");
		panel_11.setLayout(null);

		JTextPane textPane_15 = new JTextPane();
		textPane_15.setText("ȸ������");
		textPane_15.setFont(new Font("����", Font.PLAIN, 14));
		textPane_15.setBounds(24, 10, 62, 23);
		panel_11.add(textPane_15);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(12, 22, 548, 544);
		panel_11.add(panel_12);

		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("��  �� ��");
		textPane_5.setBounds(12, 86, 54, 21);
		panel_12.add(textPane_5);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 86, 187, 21);
		panel_12.add(textField_1);

		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("��      ��");
		textPane_8.setBounds(11, 117, 54, 21);
		panel_12.add(textPane_8);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(78, 117, 458, 21);
		panel_12.add(textField_3);

		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText("��      ��");
		textPane_14.setBounds(12, 214, 54, 21);
		panel_12.add(textPane_14);
		////////////////////////////////////////////////////////////////////////////
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(79, 159, 457, 137);
		panel_12.add(scrollPane_4);

		JTextPane textPane_16 = new JTextPane();
		textPane_16.setText("ȸ�����");
		textPane_16.setBounds(12, 24, 54, 21);
		panel_12.add(textPane_16);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "�Ϲ�", "vip" }));
		comboBox.setBounds(79, 24, 187, 21);
		panel_12.add(comboBox);

		JTextPane textPane_17 = new JTextPane();
		textPane_17.setText("ȸ����ȣ");
		textPane_17.setBounds(280, 24, 54, 21);
		panel_12.add(textPane_17);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(346, 24, 108, 21);
		panel_12.add(textField_10);

		JButton btnNewButton = new JButton("�ű�");
		btnNewButton.setBounds(466, 24, 70, 23);
		panel_12.add(btnNewButton);

		JTextPane textPane_18 = new JTextPane();
		textPane_18.setText("ȸ  �� ��");
		textPane_18.setBounds(12, 55, 54, 21);
		panel_12.add(textPane_18);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(79, 55, 149, 21);
		panel_12.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(306, 55, 230, 21);
		panel_12.add(textField_12);

		JTextPane textPane_19 = new JTextPane();
		textPane_19.setText("��ȭ��ȣ");
		textPane_19.setBounds(240, 55, 54, 21);
		panel_12.add(textPane_19);

		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(27, 299, 48, 23);
		panel_12.add(textPane_6);
		textPane_6.setText("ȸ����");
		textPane_6.setFont(new Font("����", Font.PLAIN, 14));

		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.GRAY));
		panel_13.setBounds(12, 310, 524, 189);
		panel_12.add(panel_13);
		panel_13.setLayout(null);

		JTextPane textPane_20 = new JTextPane();
		textPane_20.setText("���� �ҷ�����");
		textPane_20.setBounds(12, 20, 82, 36);
		panel_13.add(textPane_20);

		JButton button = new JButton("����ã��");
		button.setBounds(231, 20, 81, 23);
		panel_13.add(button);

		JTextPane txtpnbmpgifpng = new JTextPane();
		txtpnbmpgifpng.setFont(new Font("����", Font.PLAIN, 12));
		txtpnbmpgifpng.setText("*.bmp, *,gif, *.png, *.jpg");
		txtpnbmpgifpng.setBounds(313, 20, 146, 23);
		panel_13.add(txtpnbmpgifpng);

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.setBounds(106, 20, 113, 23);
		panel_13.add(panel_14);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("�⺻");
		rdbtnNewRadioButton.setBounds(12, 50, 121, 23);
		panel_13.add(rdbtnNewRadioButton);

		JRadioButton radioButton = new JRadioButton("���� �⺻");
		radioButton.setBounds(12, 75, 121, 23);
		panel_13.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("���� �⺻");
		radioButton_1.setBounds(12, 100, 121, 23);
		panel_13.add(radioButton_1);

		JPanel panel_10 = new JPanel();
		panel_3.add(panel_10, "cell 0 1,grow");
		///////////////////////////////////////////////////////////////////////////////
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("�뿩", null, panel_5, null);

		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("�ݳ�", null, panel_6, null);
	}
}
