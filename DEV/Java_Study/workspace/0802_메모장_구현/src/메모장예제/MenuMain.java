package 메모장예제;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * 자바로 윈도우 프로그램(GUI 프로그램) 만들기
 * Jframe 클래스는 최상위 컨테이너 클래스이다.
 * MenuMain 클래스는 최상이 컨테이너 클래스 성격을 가지게 된다.
 */
public class MenuMain extends JFrame{
	//3.객체 참조변수 선언
	JFrame main_fr =new JFrame("메뉴 만들기");
	JMenuBar            mb;
	JMenu               file, sort, help;
	JMenuItem           fopen, fsave, fexit, proinfo;
	JCheckBoxMenuItem   sno, sname, schul,sjob;
	
	
	
	
	//2.생성자 구현
	public MenuMain() {
		//4. 객체 생성
		mb =new JMenuBar();
		file = new JMenu("파일");
	    sort = new JMenu("정렬");
	    help = new JMenu("도움말");
	    
	    
	   
	    fopen = new JMenuItem("열기");
	    fsave = new JMenuItem("저장");
	    fexit = new JMenuItem("닫기");
	    
	    //추가요
	    //논리적 그룹화 => [이유] JCheckBoxMenuItem객체는 그룹화 시키지 않으면 해제(x)
	    ButtonGroup bg = new ButtonGroup();

	    sno = new JCheckBoxMenuItem("번호");
	    sname = new JCheckBoxMenuItem("이름");
	    schul = new JCheckBoxMenuItem("출신도");
	    sjob = new JCheckBoxMenuItem("직업");
	    
		bg.add(sno); bg.add(sname); bg.add(schul); bg.add(sjob);
		proinfo = new JMenuItem("프로그램 정보");
		
		file.add(fopen);
		file.add(fsave);
		file.addSeparator(); // 구분선 넣기
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
		//1. 객체 생성
          MenuMain menuMain = new MenuMain();
          
          
	}

}
