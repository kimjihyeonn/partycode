package JTable만들기;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame{
	//���� Ŭ���� ��ü �������� ����
	JTable 			table;
	JScrollPane		scroll;
	
	//�÷��� ���� �迭 ��ü ���� �� �ʱ�ȭ
	String[] title = {"��ȣ", "�̸�", "����", "�ڵ��� ��ȣ", "�̸���"};
	
	//String 2���� �迭 ��ü ���� �� �ʱ�ȭ
	//�����͸� 2���� �迭�� ������
	String[][] data 
	= {{"1", "����ȣ", "����", "010-2315-1234", "park1234@naver.com"},
	   {"2", "������", "����", "010-6523-1256", "kim77@naver.com"},
	   {"3", "������", "����", "010-3425-6512", "son123@gmail.com"},
       {"4", "����ö", "����", "010-6523-3537", "oh12345@hanmail.net"},
	};

	//������ ����
	public JTableTest() {
		setTitle("JTable �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//[�߿�] � �����ڸ� �����Ͽ� ��ü�� ������ ������ ������ �Ǵ�
		table = new JTable(data, title); //JTable ��ü ����
		scroll = new JScrollPane(table); //��ũ�ѹ� ����
		
		add(scroll);
		
		//[�߰�] ���� ũ�⸦ �����ϱ�
		table.getColumnModel().getColumn(0).setPreferredWidth(50); //��ȣ
		table.getColumnModel().getColumn(1).setPreferredWidth(70); //�̸�
		table.getColumnModel().getColumn(2).setPreferredWidth(120); //����
		table.getColumnModel().getColumn(3).setPreferredWidth(170); //�ڵ�����ȣ
		table.getColumnModel().getColumn(4).setPreferredWidth(200); //�̸���
		
		//      �ʺ�      ����
		setSize(450, 100);
		setLocation(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JTableTest jtableTest = new JTableTest();

	}

}
