package 메모장예제;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/*
 * 자바언어의 '이벤트 처리' 해결 방법 => java.awt.event 패키지 참조
 * ActionListener    인터페이스가 필요하다
 * void  actionPerformed(ActionEvent e) 이 추상메소드 필요
 * 
 * JMenuItem 객체는 => ActionEvent 발생시키는 컴포넌트다
 */
                                    //추가1
public class MemoEx extends JFrame implements ActionListener {
	JFrame main_fr = new JFrame("메모장 만들기");
	JTextArea area;
	//추가2
	FileDialog readOpen; //FileDialog 클래스는 '열기,'저장'창을 띄우는 클래스
	FileDialog saveOpen;
	
	//생성자
	public MemoEx() {
		JMenuBar main_bar= new JMenuBar();
		JMenu main_file= new JMenu("파일");
		JMenuItem file_load = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		
		area = new JTextArea();
		//추가=> 이벤트 연결 => JMenuItem 객체와 이벤트핸들러리스너 객체를 연결

		file_load.addActionListener(this);
		file_save.addActionListener(this);
		
		//객체 붙이기
		
		main_file.add(file_load);
		main_file.add(file_save);
		main_bar.add(main_file);
		
		main_fr.setJMenuBar(main_bar);
		main_fr.add(area);
		
		main_fr.setBounds(300,400,500,400);
		main_fr.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 String itemPressed = e.getActionCommand();
		if(itemPressed.equals("저장")){
			String name = saveName(); //사용자정의 메소드
			try {//보조기억장치에 저장 시 반드시 예외처리를 해야 한다.
				save(name); //사용자 정의 메소드 호출
			}catch(Exception ex) {
				System.out.println(ex);
			}
			
		}
		
	
		if(itemPressed.equals("열기")){
			String name = readName();
			try {
				  read(name);
			}catch(Exception ex) {
				System.out.println(ex);
			}
			
		}
	}  //end actionPerformed() =======================
	
   public void save(String savefile) throws IOException {
	  /*
	   * 보조스트림 참조변수=new 보조스트림생성자(new 기본연결스트림생성자(매개변수값));
	   * 
	   * 
	   * [이유] =>입출력 성능 향상
	   */
    BufferedWriter save= new BufferedWriter(new FileWriter(savefile));
    String line = area.getText();
    save.write(line);
    save.close();  //자원해제

   }
   
   public void read(String readfile) throws IOException{
	   BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(readfile),"UTF8"));
	   area.setText("");
	   String line =read.readLine();
	   while(line !=null) {
		   area.append(line +'\n');
		   line =read.readLine();
	   }
	   read.close();
   }
   
   public String saveName() {
	   saveOpen = new FileDialog(main_fr, "문서저장", FileDialog.SAVE);
	   saveOpen.setVisible(true);
	   String fileDir = saveOpen.getDirectory();
	   String fileName = saveOpen.getFile();
	   String savefilename = fileDir +"//" +fileName + ".txt";
	   
	   return savefilename;
	   
   }
   
   public String readName() {
	   readOpen = new FileDialog(main_fr,"문서열기",FileDialog.LOAD);
	   readOpen.setVisible(true);
	   String fileDir = readOpen.getDirectory();
	   String fileName = readOpen.getFile();
	   String readfilename = fileDir+"//"+fileName;
	   return readfilename;
   }
	public static void main(String[] args) {
	         MemoEx memo =new MemoEx();
	          

	}


}
