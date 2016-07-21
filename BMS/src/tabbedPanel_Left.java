import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import java.util.Timer;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tabbedPanel_Left extends JTabbedPane {
	JTable book_table;
	static JTable member_table;
	private JTabbedPane tabbedPane;
	JScrollPane scrollPane_Mem;
	JScrollPane scrollPane_Book;
	Vector data_Book = new Vector();
	Vector data_Member = new Vector();
	Vector title_Book = new Vector();
	Vector title_Member = new Vector();
	readExcel readEx = new readExcel();

	public tabbedPanel_Left() {

	}

	public tabbedPanel_Left(String title) {
		init();
	}

	public void init() {
		////////////////////////////////////////////////////////////////////
		tabbedPanel_Right_bookMngt tbprb = new tabbedPanel_Right_bookMngt();
		////////////////////////////////////////////////////////////////////
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane_Book = new JScrollPane();
		tabbedPane.addTab("������Ȳ", null, scrollPane_Book, null);
		////////////////////////////////////////////////////////////////////////
		DefaultTableModel model_Book = new DefaultTableModel() {
			public boolean isCellEditable(int row, int column) {
				if (column >= 0) {
					return false;
				} else {
					return true;
				}
			}
		};
		///////////////////////////////////////////////////// ���̺� ���� �ȵǰ� ���� �ڵ�
		book_table = new JTable(model_Book);

		Book book = new Book();
		title_Book.add("������ȣ");
		title_Book.add("������");
		title_Book.add("����");
		title_Book.add("���ǻ�");

		data_Book = readEx.getVector();

		model_Book.setDataVector(data_Book, title_Book);

		scrollPane_Book.setViewportView(book_table);
		//////////////////////////////////////////////////////////////////// ���콺
		//////////////////////////////////////////////////////////////////// Ŭ��
		//////////////////////////////////////////////////////////////////// �̺�Ʈ

		book_table.addMouseListener(new MyMouseListener_Book() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					Vector inner_Book = new Vector();
					inner_Book = (Vector) data_Book.elementAt(book_table.getSelectedRow());
					tbprb.setBookTextField(Integer.parseInt(inner_Book.elementAt(0).toString()), (String) inner_Book.elementAt(1),
							(String) inner_Book.elementAt(2), (String) inner_Book.elementAt(3));
				} // Ŭ��
			}
		});
		////////////////////////////////////////////////////////////////////// �������
		////////////////////////////////////////////////////////////////////// book_table
		scrollPane_Mem = new JScrollPane();
		tabbedPane.addTab("ȸ����Ȳ", null, scrollPane_Mem, null);

		DefaultTableModel model_Member = new DefaultTableModel() {
			public boolean isCellEditable(int row, int column) {
				if (column >= 0) {
					return false;
				} else {
					return true;
				}
			}
		};

		member_table = new JTable(model_Member);
		scrollPane_Mem.setViewportView(member_table);
		title_Member.add("ȸ����ȣ");
		title_Member.add("ȸ����");
		title_Member.add("��ȭ��ȣ");
		title_Member.add("�ּ�");
		title_Member.add("�̸���");

		DAO_DB dao_Member = new DAO_DB();
		data_Member = dao_Member.mem_selectAll();
		model_Member.setDataVector(data_Member, title_Member);

		member_table.addMouseListener(new MyMouseListener_Member() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					DAO_DB dao_Member = new DAO_DB();
					data_Member = dao_Member.mem_selectAll();
					Vector inner_Member = new Vector();
					inner_Member = (Vector) data_Member.elementAt(member_table.getSelectedRow());
					tbprb.setMemTextField((int) inner_Member.elementAt(0), (String) inner_Member.elementAt(1),
							(String) inner_Member.elementAt(2));
				}
			}
		});
	}

	public void setTable(Vector data_Member, Vector title_Member) {
		DefaultTableModel model_Temp = new DefaultTableModel() {
			public boolean isCellEditable(int row, int column) {
				if (column >= 0) {
					return false;
				} else {
					return true;
				}
			}
		};
		member_table.setModel(model_Temp);
		model_Temp.setDataVector(data_Member, title_Member);
	}

	public void FocusOnBook() {
		scrollPane_Book.requestFocus();
	}

	public void FocusOnMember() {
		scrollPane_Mem.requestFocus();
	}

	public JTabbedPane getPanel() {
		return tabbedPane;
	}
}

abstract class MyMouseListener_Book extends MouseAdapter {
	abstract public void mouseClicked(MouseEvent e);
}

abstract class MyMouseListener_Member extends MouseAdapter {
	abstract public void mouseClicked(MouseEvent e);
}
