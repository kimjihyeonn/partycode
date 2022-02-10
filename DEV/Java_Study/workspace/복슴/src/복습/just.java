package 복습;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class just extends JFrame {
	MenuMain menuMain = new MenuMain();
	West west = new West();
	Buttons buttons = new Buttons();
	ShowTable showTable = new ShowTable();
	
	int updateRow;
	

	public just() {
		setTitle("고객관리시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(menuMain.mb,BorderLayout.NORTH);
		add(west,BorderLayout.WEST);
		add(buttons,BorderLayout.SOUTH);
		add(showTable.scrollPane,BorderLayout.CENTER);
		setSize(600,300);
		setLocation(700,300);
		setVisible(true);
		
		
	}
	
	class MenuMain extends JPanel implements ActionListener,ItemListener{
		JMenuBar mb;
		JMenu    file,sort,help;
		JMenuItem fopen,fsave,fexit,proinfo;
		JCheckBoxMenuItem sname;
		
		FileDialog readOpen, saveOpen;
		String fileDir,fileName,readFileName,saveFileName;
		
		public MenuMain() {
			mb = new JMenuBar();
			file = new JMenu("파일");
			sort=new JMenu("정렬");
			help=new JMenu("도움말");
			
			fopen = new JMenuItem("열기");
			fsave = new JMenuItem("저장");
			fexit = new JMenuItem("닫기");
			
			sname = new JCheckBoxMenuItem("이름");
			proinfo = new JMenuItem("프로그램 정보");
			
			file.add(fopen);
			file.add(fsave);
			file.add(fexit);
			
			sort.add(sname);
			help.add(proinfo);
			
			mb.add(file); mb.add(sort); mb.add(help);
			
			fopen.addActionListener(this);
			fsave.addActionListener(this);
			fexit.addActionListener(this);
			sname.addItemListener(this);
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class West extends JPanel{
		
	}
	class Buttons extends JPanel implements ActionListener{
		
	}
	class ShowTable extends MouseAdapter{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
