package �޸��忹��;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * �ڹٷ� ������ ���α׷�(GUI ���α׷�) �����
 * Jframe Ŭ������ �ֻ��� �����̳� Ŭ�����̴�.
 * MenuMain Ŭ������ �ֻ��� �����̳� Ŭ���� ������ ������ �ȴ�.
 */
public class MenuMain extends JFrame{
	//3.��ü �������� ����
	JFrame main_fr =new JFrame("�޴� �����");
	JMenuBar            mb;
	JMenu               file, sort, help;
	JMenuItem           fopen, fsave, fexit, proinfo;
	JCheckBoxMenuItem   sno, sname, schul,sjob;
	
	
	
	
	//2.������ ����
	public MenuMain() {
		//4. ��ü ����
		mb =new JMenuBar();
		file = new JMenu("����");
	    sort = new JMenu("����");
	    help = new JMenu("����");
	    
	    
	   
	    fopen = new JMenuItem("����");
	    fsave = new JMenuItem("����");
	    fexit = new JMenuItem("�ݱ�");
	    
	    //�߰���
	    //���� �׷�ȭ => [����] JCheckBoxMenuItem��ü�� �׷�ȭ ��Ű�� ������ ����(x)
	    ButtonGroup bg = new ButtonGroup();

	    sno = new JCheckBoxMenuItem("��ȣ");
	    sname = new JCheckBoxMenuItem("�̸�");
	    schul = new JCheckBoxMenuItem("��ŵ�");
	    sjob = new JCheckBoxMenuItem("����");
	    
		bg.add(sno); bg.add(sname); bg.add(schul); bg.add(sjob);
		proinfo = new JMenuItem("���α׷� ����");
		
		file.add(fopen);
		file.add(fsave);
		file.addSeparator(); // ���м� �ֱ�
		file.add(fexit);
		
		sort.add(sno);
		sort.add(sname);
		sort.add(schul);
		sort.add(sjob);
		
		help.add(proinfo);
		
		mb.add(file);
		mb.add(sort);
		mb.add(help);
		
		main_fr.setJMenuBar(mb);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_fr.setBounds(200,200,500,300);
		main_fr.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		//1. ��ü ����
          MenuMain menuMain = new MenuMain();
          
          
	}

}
