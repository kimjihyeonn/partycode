package 고객관리시스템_추가_수정_삭제;
/**
 * <<개정 이력(Modification Infomation) >> 
 *    수정일                                   수정자                   수정내용
 *  ========               =====         ======
 *  2021.08.03(11:42)      김지현                 UI 설
 *  2021.08.04             김지현                
 * 
 * 
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
               //외부 클래스
public class CustomerManagement extends JFrame {
	
	
	//[위치 중요] => 4개의 내부 클래스객체 생성 => 글로벌 (전역)변수
	
	MenuMain menuMain = new MenuMain();
	West west = new West();
	Buttons buttons = new Buttons();
	ShowTable showTable = new ShowTable();
	//[중요] 추가  => 전역변수 선언
	int updateRow;// 수정 기능을 하기 위해서 필요한 전역변수이다. 0으로 자동초기화된다.
	
	//생성자 구현 =>외부 클래스 것
	public CustomerManagement() {
		setTitle("고객관리시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//내부클래스 화면 구성배치 BorderLayout 배치
		add(menuMain.mb, BorderLayout.NORTH);
		add(west,BorderLayout.WEST);
		add(buttons,BorderLayout.SOUTH);
		add(showTable.scrollPane,BorderLayout.CENTER);
		
		
		
		setSize(600,300);
		setLocation(700, 300);
		setVisible(true);
		
		

		
	}
	//MenuMain 내부클래스 설계  구현	
	//상속을 받을 때는 하나의 클래스만 상속가능 다중상속 허용(x),인터페이스는 여러개를 구현시킬 수 있다.
	class MenuMain extends JPanel 
	implements ActionListener,ItemListener
	{  //전역객체 참조변수 선언
		JMenuBar          mb;
		JMenu             file,sort,help;
		JMenuItem         fopen,fsave,fexit,proinfo;
		JCheckBoxMenuItem  sname;
		
		FileDialog readOpen, saveOpen;
		String fileDir, fileName,readFileName,saveFileName;
		
		
		//생성자
		public MenuMain() {
			mb = new JMenuBar();
			file =new JMenu("파일");
			sort =new JMenu("정렬");
			help= new JMenu("도움말");
			
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
			
			//컴퍼넌트와 이벤트핸들러 리스너 객체 연결(등록)
			//addXxxListener()
			fopen.addActionListener(this);
			fsave.addActionListener(this);
			fexit.addActionListener(this);
			sname.addItemListener(this);
			
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("저장")) save();// 사용자 정의 메소드 호출
			else if(e.getActionCommand().equals("열기")) open();
			else if(e.getActionCommand().equals("닫기")) exit();
			
			
			
			
		}
		public void save() {
			saveOpen = new FileDialog(CustomerManagement.this, "문서저장", FileDialog.SAVE);
			
			saveOpen.setVisible(true);
			fileDir = saveOpen.getDirectory();
			fileName = saveOpen.getFile();
			saveFileName= fileDir+"//"+fileName;
			
			String str = "";
			String temp = "";
			
			try {
				BufferedWriter save = new BufferedWriter(new FileWriter(saveFileName));
				for(int i=0; i<showTable.table.getRowCount();i++) {
					//[중요]
					temp = showTable.data.elementAt(i).toString();
			      str= str+ temp.substring(1, temp.length()-1) +"\n";
				}
				save.write(str);
				save.close();
			}catch(IOException ex) {
				System.out.println(ex);
			}
			
		}
		public void open() {
			StringTokenizer    st;
			Vector<String>     vec;
			
			readOpen = new FileDialog(CustomerManagement.this,"문서 열기",FileDialog.LOAD);
			
			readOpen.setVisible(true);
			fileDir=readOpen.getDirectory();
			fileName=readOpen.getFile();
			readFileName=fileDir+"//"+fileName;
			try {
				BufferedReader read = new BufferedReader(new FileReader(readFileName));
				String line = null;
				
				//홍길동, 010-3213-1234, 891024-1241536 저장 가정
				while((line = read.readLine()) != null) {
					st = new StringTokenizer(line, ", ");
					
					vec = new Vector<String>();
					
					while(st.hasMoreTokens()) {
						vec.add(st.nextToken());
					}
					showTable.data.addElement(vec);
				}
				showTable.datamodel.fireTableDataChanged();
			}catch(IOException e) {
				System.out.println(e);
			}
			
		}
		public void exit() {
			
			System.exit(0); //프로세스를 정상종료시켜라 
			
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			// "이름"으로 정렬하기
			
			int rowCount = showTable.table.getRowCount();//table 객체의 행의갯수
			int colCount = showTable.table.getColumnCount();
			/*
			 * 시나리오 =>1. 먼저 table의 데이터를 2차원 배열로 옮기기
			 *         2. 2차원 배열 정렬 시키기
			 *         3. 정렬시킨 데이터를 table로 옮기기
			 *   
			 */
		    String[][] arr = new String[rowCount][colCount];
		    String temp;
			for(int i=0;i<rowCount;i++) {
				for(int j=0;j<colCount;j++) {
					arr[i][j]=(String)showTable.table.getValueAt(i, j);
				}
			}
			//2차원배열 정렬 => 선택정렬 알고리즘 적용
		   for(int i=0;i<rowCount-1;i++) {
			   for(int j=i+1;j<rowCount;j++) {
				   if(arr[i][0].compareTo(arr[j][0]) >0) {
					   for(int k=0; k<colCount;k++) {
						   temp =arr[i][k];
						   arr[i][k] = arr[j][k];
						   arr[j][k]=temp;
					   }
				   }
				   
			   } 
		   
		   }
		     
		     
		     for(int i=0; i<rowCount;i++) {
		    	 for(int j=0;j<colCount;j++) {
		    		 showTable.table.setValueAt(arr[i][j], i, j);
		    	 }
		     }
		     
		    
			}
			
			
	}


		
	
	
	class West extends JPanel{
		JLabel     la;
		JTextField[]  tf;
		
		 
		public West() {
			//[입력] 보더 만들기
			LineBorder line = new LineBorder(Color.BLUE,2);
			setBorder(new TitledBorder(line, "입력"));
			
			String[] text = {"이  름","핸드폰번호","주민등록번호"};
			tf = new JTextField[3];
			setLayout(new GridLayout(3, 2, 5, 10));
			
			for(int i=0; i<text.length;i++) {
				la = new JLabel(text[i]);
				tf[i] = new JTextField(20);
				la.setHorizontalAlignment(JLabel.CENTER);
				add(la); add(tf[i]);
			}
			
			setPreferredSize(new Dimension(230,300));
			
		}
		
		
	}
	class Buttons extends  JPanel implements ActionListener{
		Vector<String> vector;
		JButton        addBtn,updateBtn,delBtn;
		String         juminNo;
		
		
		//생성자
		public Buttons(){
                     setLayout(new GridLayout(1,3,5,0))	;
                     addBtn = new JButton("추가");
                     updateBtn = new JButton("수정");
                     delBtn = new JButton("삭제");
                     addBtn.setBackground(Color.GREEN);
                     updateBtn.setBackground(Color.YELLOW);
                     delBtn.setBackground(Color.LIGHT_GRAY);
                     
                     add(addBtn); add(updateBtn); add(delBtn);
                     
                     addBtn.addActionListener(this);
                     updateBtn.addActionListener(this);
                     delBtn.addActionListener(this);
                     
                     
		}

		@Override  //재정의
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("추가")) addData();//사용자정의 메소드
			else if(e.getActionCommand().equals("수정")) updateData();
			else if(e.getActionCommand().equals("삭제")) deleteData();
			
			
			
		} //end actionPerformed() ===========================
		
		public void addData() { //추가 작업 처리
			Vector<String> vector = new Vector<String>();
			vector.add(west.tf[0].getText());
			vector.add(west.tf[1].getText());
			//사용자가 입력한 주민번호를 Vector객체에 저장하기 전에
			//유효성 체크와 준민번호 공식 적용하여 정상인 경우에만 Vector객체에 저장하자
			//앞전에 했떤 소스를 찾아 붙여넣기 합시다.
			juminNo = west.tf[2].getText();
			String regex = "^[0-9]{2}([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])-[1234][0-9]{6}$";
	        boolean check = Pattern.matches(regex, juminNo);
			
			if(check == false) {
				JOptionPane.showMessageDialog(null, "입력된 주민번호는 정규 표현식 패턴에 맞지 않습니다.", 
						  "경고 메시지", JOptionPane.ERROR_MESSAGE);
				west.tf[2].setText("");
				west.tf[2].requestFocus();
				return; //지금 상태 유지해라! => 사용자가 다시 입력 받을 때 까지...
			}
			//패턴에 맞는 경우 => 주민번호 체크 공식 적용
			int sum = 0; //지역변수는 초기화 하자
           int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};	
           for(int i=0;i<weight.length;i++) {
   			if(juminNo.charAt(i) =='-')continue;
   			 sum = sum + (juminNo.charAt(i)-48) * weight[i];
   			}
        int   temp= 11-(sum%11);
   		int   result = temp%10;
   		if(result == juminNo.charAt(13)-48) {
   			JOptionPane.showMessageDialog(null, "주민번호 체크 결과 정상입니다.");
   			//주민번호가 정상이기 때문에 Vector 객체에 저장하자!!
   			vector.add(west.tf[2].getText());
   			
   			west.tf[0].setText(null);
   			west.tf[1].setText(null);
   			west.tf[2].setText(null);
   			west.tf[0].requestFocus();
   			//[중요]
   			showTable.data.addElement(vector);
   			//데이터가 변경된 후 변경사항을 JTable에 적용하려면 이 메소드를  호출하면 된다.
   			showTable.datamodel.fireTableDataChanged();
   		}else { JOptionPane.showMessageDialog(null, "주민번호 틀림!!", 
				  "경고 메시지", JOptionPane.ERROR_MESSAGE
				  );
   		
   			
   		}
			
		}
		public void updateData() { //수정 작업 처리
			
			showTable.table.setValueAt(west.tf[0].getText(), updateRow, 0);
			showTable.table.setValueAt(west.tf[1].getText(), updateRow, 1);
			west.tf[0].setText(null);
   			west.tf[1].setText(null);
   			west.tf[2].setText(null);
   			//추가 주민번호 입력을 받기 위해서 주민번호 JTextField 활성화 시키자!!
   			west.tf[2].setEditable(true);
   			west.tf[0].requestFocus();
			
			
		}
		public void deleteData() { //삭제 작업 처리
			int yes_no_select = JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까","고객데이터 삭제",JOptionPane.YES_NO_OPTION);
			
			if(yes_no_select == JOptionPane.YES_OPTION) {
				JTable tb = showTable.table;
				int deleteRow = tb.getSelectedRow();
				
				if(deleteRow == -1) {//어느행을 선택하지않고 삭제버튼을 누를경우 getSelectedRow() -1을 리턴해준다.
					return;
				}else { // 어느행을 선택한 경우
					DefaultTableModel model= (DefaultTableModel) tb.getModel();
					 model.removeRow(deleteRow);
					 west.tf[0].setText(null);
			   			west.tf[1].setText(null);
			   			west.tf[2].setText(null);
			   			//추가 주민번호 입력을 받기 위해서 주민번호 JTextField 활성화 시키자!!
			   			west.tf[2].setEditable(true);
			   			west.tf[0].requestFocus();
				}
			}else {
				return;
			}
		}
		
		
	}
	
	
 class ShowTable extends MouseAdapter{
		DefaultTableModel datamodel;
		JTable table;
		JScrollPane  scrollPane;
		String[] colName = {"이름","핸드폰번호","주민등록번호"};
		//[중요]
		
		Vector<Vector<String>> data;
		Vector<String>     column_name;
		
		
		//생성자
		public ShowTable() {
			data = new Vector<Vector<String>>();
			column_name = new Vector<String>();
			for(int i = 0; i<colName.length;i++) {
				column_name.add(colName[i]);
			}
			
	    //[중요]
			//1. 먼저 JTable에 사용할 모델(Model) 결정
			datamodel = new DefaultTableModel(data, column_name);
			
			//2. 위에서 만든 모델을 선정하며 ㄴJTable 생성
			table = new JTable(datamodel);
			
			//3. JTable 에 입력될 data량이 많을 경우를 대비해서 스크롤바를 붙인다.
			scrollPane = new JScrollPane(table);
			
			//셀의크기 조절
			
			table.getColumnModel().getColumn(0).setPreferredWidth(50);
			table.getColumnModel().getColumn(1).setPreferredWidth(100);
			table.getColumnModel().getColumn(2).setPreferredWidth(120);
            //컴퍼넌트와 이벤트핸들러리스너 객체 연결(등록)
			table.addMouseListener(this);			
			
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		//2번째 추가 
		updateRow = table.getSelectedRow();
		
		west.tf[0].setText((String) showTable.table.getValueAt(updateRow, 0));
		west.tf[1].setText((String) showTable.table.getValueAt(updateRow, 1));
		west.tf[2].setText((String) showTable.table.getValueAt(updateRow, 2));
		//[중요] 주민번호
		west.tf[2].setEditable(false);
	}	

		
 }		

	public static void main(String[] args) {
		CustomerManagement cm = new CustomerManagement();

	}

  
 
   }
	
	

  
	


	
