package �޸��忹��;

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
 * �ڹپ���� '�̺�Ʈ ó��' �ذ� ��� => java.awt.event ��Ű�� ����
 * ActionListener    �������̽��� �ʿ��ϴ�
 * void  actionPerformed(ActionEvent e) �� �߻�޼ҵ� �ʿ�
 * 
 * JMenuItem ��ü�� => ActionEvent �߻���Ű�� ������Ʈ��
 */
                                    //�߰�1
public class MemoEx extends JFrame implements ActionListener {
	JFrame main_fr = new JFrame("�޸��� �����");
	JTextArea area;
	//�߰�2
	FileDialog readOpen; //FileDialog Ŭ������ '����,'����'â�� ���� Ŭ����
	FileDialog saveOpen;
	
	//������
	public MemoEx() {
		JMenuBar main_bar= new JMenuBar();
		JMenu main_file= new JMenu("����");
		JMenuItem file_load = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		
		area = new JTextArea();
		//�߰�=> �̺�Ʈ ���� => JMenuItem ��ü�� �̺�Ʈ�ڵ鷯������ ��ü�� ����

		file_load.addActionListener(this);
		file_save.addActionListener(this);
		
		//��ü ���̱�
		
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
		if(itemPressed.equals("����")){
			String name = saveName(); //��������� �޼ҵ�
			try {//���������ġ�� ���� �� �ݵ�� ����ó���� �ؾ� �Ѵ�.
				save(name); //����� ���� �޼ҵ� ȣ��
			}catch(Exception ex) {
				System.out.println(ex);
			}
			
		}
		
	
		if(itemPressed.equals("����")){
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
	   * ������Ʈ�� ��������=new ������Ʈ��������(new �⺻���ὺƮ��������(�Ű�������));
	   * 
	   * 
	   * [����] =>����� ���� ���
	   */
    BufferedWriter save= new BufferedWriter(new FileWriter(savefile));
    String line = area.getText();
    save.write(line);
    save.close();  //�ڿ�����

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
	   saveOpen = new FileDialog(main_fr, "��������", FileDialog.SAVE);
	   saveOpen.setVisible(true);
	   String fileDir = saveOpen.getDirectory();
	   String fileName = saveOpen.getFile();
	   String savefilename = fileDir +"//" +fileName + ".txt";
	   
	   return savefilename;
	   
   }
   
   public String readName() {
	   readOpen = new FileDialog(main_fr,"��������",FileDialog.LOAD);
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
