package 고객관리시스템_추가_수정_삭제;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.sound.sampled.LineListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
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



/**
 * <<개정 이력(Modification Information) >>
 * 
 *   수정일                                  수정자               작업 및 수정 내용
 *  ======              ======     		========
 *  2021.08.03(11:42)   지태훈                UI(사용자 인터페이스) 설계/분석/구현
 *  2021.08.04          지태훈                이벤트 처리(추가,수정,삭제,저장,불러오기,닫기,이름 정렬)기능
 *  2021.08.05			지태훈		회원번호,이메일(west&center),나이,성별,출생지역,셍일,직업(center)
 *  								이전,다음,검색 버튼(bottom)
 */

             //외부 클래스
public class CustomerManagement extends JFrame {
	
	//[위치중요] => 4개의 내부 클래스 객체 생성 => 글로벌(전역) 객체 참조변수
	//메소드 안에 구현을 하지 않았기 때문에 전역(global)변수, 어느 곳에서나 접근가능
	//1. 클래스 이름 결정
	MenuMain menuMain = new MenuMain();
	West west = new West();
	West wb = new West();
	Buttons buttons = new Buttons();
	ShowTable showTable = new ShowTable();
	
	//[중요] 첫번째 추가 => 전역변수 선언
	int updateRow; //데이터 수정 기능을 하기 위해서 필요한 전역변수이다. 0으로 자동초기화된다.
	
	//생성자 구현 => 외부 클래스 것
	public CustomerManagement() {	  
		      // (4) 레이블 선언: 대문자로 선언하는 관례
		      OUTTER: while(true) {   // 무한 루프
		         ImageIcon icon = new ImageIcon("src/images/고객관리정보_이미지.jpg");         
		         // 이미지 객체로부터 이미지 아이콘을 생성한다. 인자값 String
		         
		         // (5) 팝업 다이얼로그 만들기 : 인트로 창을 띄우는 것
		         JOptionPane.showMessageDialog(null, null, "고객정보관리시스템", JOptionPane.NO_OPTION, icon);
		         
		         // (6) 패스워드 입력받아 인증처리 대화 상자 만들기
		         String password = JOptionPane.showInputDialog("고객관리시스템"+"\n"+"패스워드 입력"); // 고객관리 시스템 먼저 보여주고 줄바꿔서 패스워드 입력을 띄워라
		         
		         String passwd = "1234"; // 패스워드 설정
		         // password  : 사용자가 입력하는 패스워드를 받는다
		         // passwd: 설정한 패스워드
		         
		         if(password == null) { // 사용자가 패스워드를 입력하지 않는 경우
		            break;
		         }else if(password.equals(passwd)) { // 인증처리 성공! 패스워드 일치
		        	 setTitle("고객관리 시스템");
		     		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     		
		     		
		     		//내부 클래스 화면 구성 BorderLayout 배치
		     		//메뉴바를 BorderLayout 북쪽에 배치하라
		     		add(menuMain.mb, BorderLayout.NORTH);
		     		add(west, BorderLayout.WEST);
		     		add(buttons, BorderLayout.SOUTH);
		     		//[주의] scrollPane을 붙여야 한다.
		     		add(showTable.scrollPane, BorderLayout.CENTER);
		     		
		     		/*
		     		 * menuMain.mb와 showTable.scrollPane을 붙여야한다.
		     		 */
		     		
		     		//사이즈
		     		setSize(1600, 900);
		     		setLocation(700, 300);
		     		setVisible(true);
		            break OUTTER;
		         }else { // 인증처리 실패! 패스워드가 잘못된 경우
		            JOptionPane.showMessageDialog(null
		                                   , "패스워드가 맞지 않습니다"+"\n"+"'확인' 버튼을 누르세요!" // 확인 버튼을 주고 싶은 경우 '' 사용 
		                                   , "에러메시지"
		                                   , JOptionPane.ERROR_MESSAGE);
		            continue OUTTER; // 이 레이블을 계속 진행하라
		         }
		         
		      } // end OUTTER
		   
		   } // end IntroPassword() 
	//내부 클래스는 외부 클래스 안에 생성
	//MenuMain 내부 클래스 설계/구현
	//자바는 하나의 클래스만 상속가능 다중상속 허용안함
	//인터페이스는 여러개를 구현시킬 수 있다.
	class MenuMain extends JPanel
	implements ActionListener, ItemListener {
		//전역 객체 참조변수 선언
		JMenuBar 	mb;
		JMenu		file, sort, help;
		JMenuItem	fopen, fsave, fexit, proinfo;
		JCheckBoxMenuItem 	sname; //이름 정렬
		
		FileDialog readOpen, saveOpen;
		String 	   fileDir, fileName, readFileName, saveFileName;
		
		
		//생성자
		public MenuMain() {
			mb = new JMenuBar();
			
			file = new JMenu("파일");
			sort = new JMenu("정렬");
			help = new JMenu("도움말");
			
			fopen = new JMenuItem("열기");
			fsave = new JMenuItem("저장");
			fexit = new JMenuItem("닫기");
			
			sname = new JCheckBoxMenuItem("이름");
			
			proinfo = new JMenuItem("프로그램 정보");
			
			
			//객체를 JPanel(작은 컨테이너)에 붙이기
			file.add(fopen); file.add(fsave); 
			file.addSeparator(); file.add(fexit);
			sort.add(sname);
			help.add(proinfo);
			
			mb.add(file); mb.add(sort); mb.add(help);
			
			//컴퍼넌트와 이벤트핼들러리스너 객체 연결
			//addXxxListener();
			fopen.addActionListener(this);
			fsave.addActionListener(this);
			fexit.addActionListener(this);
			
			sname.addItemListener(this);
		}
		//메소드 재정의
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("저장")) save();//사용자정의메소드호출
			else if(e.getActionCommand().equals("열기")) open();
			else if(e.getActionCommand().equals("닫기")) exit();
		}
		
		//'저장' 기능 처리 메소드
		public void save() {
			saveOpen 
			= new FileDialog(CustomerManagement.this, 
								"문서 저장", FileDialog.SAVE);
			saveOpen.setVisible(true);
			
			fileDir = saveOpen.getDirectory();
			fileName = saveOpen.getFile();
			readFileName = fileDir + "//" + fileName;
			
			//메모장과 다른 부분
			String str = "";
			String temp = "";
			
			//파일에 저장 시 반드시 예외처리 해준다.
			try {
				BufferedWriter save 
				= new BufferedWriter(new FileWriter(saveFileName));
				//Vector, ArrayList는 가변배열(공간이 부족하면 자동으로 늘어난다.)
				for(int i=0; i<showTable.table.getRowCount(); i++) {
					//[중요]
					temp = showTable.data.elementAt(i).toString();
					//[홍길동, 010-3213-1234, 891024-1241536]
					str = str + temp.substring(1, temp.length()-1) + "\n";
				}
				save.write(str);
				save.close();   //자원해제
			}
			catch(IOException ex) {
				System.out.println(ex);
			}
		}
		
		//'열기' 기능 처리 메소드
		public void open() {
			StringTokenizer 	st;
			Vector<String>  	vec;
			
			readOpen 
			= new FileDialog(CustomerManagement.this, 
								"문서 열기", FileDialog.LOAD);
			readOpen.setVisible(true);
			
			fileDir = readOpen.getDirectory();
			fileName = readOpen.getFile();
			readFileName = fileDir + "//" + fileName;
			
			//메모장과 다른 부분
			String str = "";
			String temp = "";
			
			//파일에 저장 시 반드시 예외처리 해준다.
			try {
				BufferedReader read 
				= new BufferedReader(new FileReader(readFileName));
				String line = null;
				//홍길동, 010-3213-1234, 891024-1241536 : 콤마 공백이 구분자
				//홍길동, 010-3213-1234, 891024-1241536 이게 line으로 저장됨
				//조건식이 true이면 반복
				while((line = read.readLine()) != null) {
					st = new StringTokenizer(line, ", ");
					
			//st에 저장된 토큰들을 JTable에 뿌려주기
					vec = new Vector<String>();
					
					while(st.hasMoreTokens()) {
						vec.add(st.nextToken());
					}
					showTable.data.addElement(vec);
				}
				showTable.datamodel.fireTableDataChanged();
				read.close();   //자원해제
			}
			catch(IOException ex) {
				System.out.println(ex);
			}
			
		}
		//'닫기' 기능 처리 메소드
		public void exit() {
			System.exit(0);  //프로그램 정상 종료
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			//'이름'으로 정렬하기
			//getRowCount : 테이블의 행의 개수 불러오는 메소드, table 객체의 행의 개수===
			int rowCount = showTable.table.getRowCount(); 
			//table 객체의 열의 개수 얻어오기=====================================
			int colCount = showTable.table.getColumnCount();
			
	/*
	 * 시나리오 => 1. 먼저 table의 데이터를 이차원 배열로 옮기기
	 * 			2. 이차원 배열 정렬시키기
	 * 			3. 정렬시킨 데이터를 table로 옮기기
	 */
			//1. 이차원 배열 객체 만들기, arr[][] == [][]arr
			String[][] arr = new String[rowCount][colCount];
			String temp;
			
			for(int i=0; i<rowCount; i++) {
				for(int j=0; j<colCount; j++) {
					arr[i][j] 
							= (String)showTable.table.getValueAt(i, j);
				}
			}
			//2. 2차원 배열 정렬 => 선택 정렬 알고리즘 적용
			for(int i=0; i<rowCount-1; i++) {
				for(int j=i+1; j<rowCount; j++) {
					if(arr[i][0].compareTo(arr[j][0])>0) {
						for(int k=0; k<colCount; k++) {
							temp = arr[i][k];
							arr[i][k] = arr[j][k];
							arr[j][k] = temp;
						}
					}
				}
			}
			//3. 정렬시킨 데이터를 table로 옮기기
			for(int i=0; i<rowCount; i++) {
				for(int j=0; j<colCount; j++) {
				showTable.table.setValueAt(arr[i][j], i, j);
				}
			}
		}
	}
	
	//West 내부 클래스 설계/구현
	class West extends JPanel{
		JLabel 			la;
		JTextField[]	tf, tff;
		// 내부 클래스
		Input input = new Input();		// '입력' 보더
		Output output = new Output();	// '신상정보' 보더
		
		
		//생성자
		public West() {
			//추가
			
			setLayout(new BorderLayout());
			add(input, BorderLayout.CENTER);
			add(output, BorderLayout.SOUTH);
			
			
			
		}
		// 내부클래스 안에 내부클래스가 또 있다.
		class Input extends JPanel{

			// 생성자
			public Input() {
				//[입력]Border만들기
				LineBorder line = new LineBorder(Color.BLUE, 2);
				setBorder(new TitledBorder(line, "입력"));
				String[] text = {"번호", "이름", "핸드폰번호", "이메일", "주민등록번호"};
				JLabel job = new JLabel("직업");
				String[] text2 = {"회사원","공무원","교수","의사",
								  "연예인","학생","기타"};
				JComboBox<String> box = new JComboBox<String>(text2);
				
				tf = new JTextField[5];
				setLayout(new GridLayout(6, 2, 5, 10));
				
				for(int i=0; i<text.length; i++) {
					la = new JLabel(text[i]);
					tf[i] = new JTextField(20);
					la.setHorizontalAlignment(JLabel.CENTER);
					add(la); add(tf[i]);
				}
				job.setHorizontalAlignment(JLabel.CENTER);
				setPreferredSize(new Dimension(600, 400));
				
				add(job);
				add(box);
		
				}
			
		}
		
		class Output extends JPanel{
			public Output() {
				LineBorder line = new LineBorder(Color.BLUE, 2);
				setBorder(new TitledBorder(line, "신상정보"));
				String[] text = {"나이", "성별", "출생지역", "생일"};
				tff = new JTextField[5];
				setLayout(new CardLayout(20,50).);
				
				for(int i=0; i<text.length; i++) {
					la = new JLabel(text[i]);
					tff[i] = new JTextField(10);
					la.setHorizontalAlignment(JLabel.LEFT);
					add(la); add(tff[i]);
				}
				setPreferredSize(new Dimension(300, 200));
				
			}	
		}
	}
	
	//Buttons 내부 클래스 설계/구현
	class Buttons extends JPanel implements ActionListener{
		Vector<String> vector;
		JButton		   addBtn, updateBtn, preBtn, nextBtn, findBtn, delBtn;  //참조변수
		String 			juminNo; //주민번호
		
		//생성자
		public Buttons() {
			//						1행 3열    간격
			setLayout(new GridLayout(1, 3, 5, 0)); 
			
			//버튼 생성
			addBtn = new JButton("추가");
			delBtn = new JButton("삭제");
			updateBtn = new JButton("수정");
			preBtn = new JButton("이전");
			nextBtn = new JButton("다음");
			findBtn = new JButton("검색");
			
			
			//버튼색
			addBtn.setBackground(Color.YELLOW);
			delBtn.setBackground(Color.LIGHT_GRAY);
			updateBtn.setBackground(Color.pink);
			findBtn.setBackground(Color.GREEN);
			
			//JPanel에 붙이기
			add(addBtn); add(delBtn); add(preBtn); add(nextBtn); add(updateBtn); add(findBtn);
			
			//컴퍼넌트와 이벤트핸들러리스너 객체 연결(등록)
			addBtn.addActionListener(this);
			updateBtn.addActionListener(this);
			delBtn.addActionListener(this);
			preBtn.addActionListener(this);
			nextBtn.addActionListener(this);
			findBtn.addActionListener(this);
			//여기까지가 생성자가 해야할 일
		}
		
		//재정의, 자식 클래스에 맞게 재정의 하라
		@Override
		public void actionPerformed(ActionEvent e) {
			//만약 e가 받은 것이 "추가"라면, equals: 문자열 받음
			if(e.getActionCommand().equals("추가")) 
				addData();//사용자 정의 메소드
			else if(e.getActionCommand().equals("수정")) updateData();
			else if(e.getActionCommand().equals("삭제")) deleteData();
		} //end actionPerformed =======================================
		//addData에서 추가 작업 실행
		public void addData() { //추가 작업을 해줘라! 전역, 지역 개념이 아님
			Vector<String> vector = new Vector<String>();
			//사용자가 입력한 값을 얻어서 저장
			vector.add(west.tf[0].getText());//이름
			vector.add(west.tf[1].getText());//핸드폰번호
			
			//사용자가 입력한 주민번호를 Vector 객체에 저장하기 전에
			//유효성 체크와 주민번호 공식 적용하여 정상인 경우에만 Vector 객체에 저장하자
			//앞전에 했던 소스를 찾아 붙여넣기 합시다.
			juminNo = west.tf[2].getText();
			
			//정규표현식 적용 => 데이터 유효성 체크하기 위해서
			String regex = "^[0-9]{6}-[1234][0-9]{6}$";
			boolean check = Pattern.matches(regex, juminNo);
			
			//패턴에 맞지 않은 경우
			if(check == false) { //윈도우 프로그램에서 출력
				//showMessageDialog - 정적 메소드(클래스 생성할 필요 없다)
				JOptionPane.showMessageDialog(null, 
											"입력된 주민번호는 맞지 않습니다", 
											"경고 메세지", 
											JOptionPane.ERROR_MESSAGE);
				west.tf[2].setText(null); //틀린 주민번호를 지움
				west.tf[2].requestFocus();
				return;  //지금상태 유지 => 사용자가 다시 입력할 때까지
			}
			//패턴에 맞는 경우 => 주민번호 체크 공식 적용
			int sum = 0; //메소드 안에서 선언 -> 지역변수 => 지역 변수는 초기화
			int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5}; //가중치 초기화
			for(int i=0; i<13; i++) {
				if(juminNo.charAt(i) == '-') continue;			
					sum = sum + (juminNo.charAt(i)-48) * weight[i];			
			}
			//System.out.println(sum);
			
			int temp = 11 - (sum%11);   //temp값이 10 또는 11인 주민번호가 있다.
			int result = temp%10;
			
			if(result == juminNo.charAt(13)-48) {
				JOptionPane.showMessageDialog(null, 
						"주민번호 체크 결과 정상입니다.");
				
				//주민번호가 정상이기 때문에 Vector 객체에 저장하자!!
				vector.add(west.tf[2].getText());
				
				west.tf[0].setText(null);
				west.tf[1].setText(null);
				west.tf[2].setText(null);
				west.tf[0].requestFocus();
				
				//[중요] 상호 작용
				showTable.data.addElement(vector);//Element = 객체
				//데이터가 변경된 후 변경사항을 JTable에 적용하려면 이 메소드를 호출하면 된다.
				showTable.datamodel.fireTableDataChanged();//변화 인식
			}
			else { //주민번호가 정상이지 않은 경우
				JOptionPane.showMessageDialog(null, 
											"주민번호 틀림", 
											"경고 메세지", 
											JOptionPane.ERROR_MESSAGE);
				west.tf[2].setText(null);
				west.tf[2].requestFocus();
			}
		}
		
		public void updateData() { //사용자 정의 메소드, 수정 작업 처리
			//'이름' 수정 후 => table 객체 변경하기
	//showTable.table.setValueAt(west.tf[0].getText(), 변수명(글로벌), 0);
	//setValueAt(수정할 대상, 행, 열) -  수정할 대상을 몇행 몇 열에 적용할 것인가.
			showTable.table.setValueAt(west.tf[0].getText(), updateRow, 0);
			
			//'핸드폰 번호' 수정 후 => table 객체 변경하기
			showTable.table.setValueAt(west.tf[1].getText(), updateRow, 1);
			
			west.tf[0].setText(null);
			west.tf[1].setText(null);
			west.tf[2].setText(null);
			//추가 주민번호를 입력받기 위해서 주민번호 JTextField 활성화 시키자!!
			west.tf[2].setEditable(true);
			west.tf[0].requestFocus();
		}
		
		public void deleteData() { //삭제 작업 처리
			//예, 아니오가 들어간 확인창(confirm), 반환타입 int이기 때문에 int 변수를 생성
			int yes_no_select = JOptionPane.showConfirmDialog
					(null, "정말 삭제하시겠습니까?", 
							"고객 데이터 삭제", JOptionPane.YES_NO_OPTION);
			
			if(yes_no_select == JOptionPane.YES_OPTION) {
				JTable tb = showTable.table;
				//getSelectedRow는 선택하지 않으면 음수값을 반환한다.
				int deleteRow = tb.getSelectedRow();
				
				//사용자가 어떤 행도 선택하지 않고 '삭제' 버튼을 누르면 getSelectedRow()
				//메소드는 -1을 반환(리턴)한다.
				if(deleteRow == -1) {
					return;
				}
				else {//사용자가 어떤 행을 선택한 경우
					DefaultTableModel model = 
							(DefaultTableModel) tb.getModel();
					model.removeRow(deleteRow);
					
					west.tf[0].setText(null);
					west.tf[1].setText(null);
					west.tf[2].setText(null);
					//추가 주민번호를 입력받기 위해서 주민번호 JTextField 활성화 시키자!!
					west.tf[2].setEditable(true);
					west.tf[0].requestFocus();
				}
			}
			else {
				return;
			}
		}
	}
	
	//ShowTable 내부 클래스 설계/ 구현
	//마우스 이벤트 발생
	//JPanel은 사용하지 않는다.
	class ShowTable extends MouseAdapter{
		DefaultTableModel   datamodel;
		JTable				table;
		JScrollPane			scrollPane;
		
		String[] colName = {"번호","이름","핸드폰 번호","E-mail",
							"주민등록 번호","나이","성별","출생지역",
							"생일","직업"};
		
		//[중요]
		Vector<Vector<String>> data;
		Vector<String> 		   column_name;
		
		
		//생성자
		public ShowTable() {
			//자료 구조 결정
			data = new Vector<Vector<String>>();
			column_name = new Vector<String>();
			
			for(int i=0; i<colName.length; i++) {
				column_name.add(colName[i]);
			}
			
			//[중요]
			//1. 먼저 JTable에 사용할 모델(Model) 결정
			datamodel = new DefaultTableModel(data, column_name);
			
			//2. 위에서 만든 모델을 선정하여 JTable 생성
			//1번 변수가 2의 매개변수로 들어감
			table = new JTable(datamodel);
			
			//3. JTable에 입력될 data량이 많을 경우를 대비해 스크롤바를 붙인다.
			//2의 변수가 3의 매개변수로 들어감
			scrollPane = new JScrollPane(table);
			
			//셀의 크기 조절
			table.getColumnModel().getColumn(0).setPreferredWidth(50); //이름
			table.getColumnModel().getColumn(1).setPreferredWidth(100); //핸드폰번호
			table.getColumnModel().getColumn(2).setPreferredWidth(120); //주민등록번호
			
			//컴퍼넌트와 이벤트핸들러리스터 객체 연결(등록)
			table.addMouseListener(this);
		}
		
		//추상메소드 재정의
		//수동으로 오버라이드 시키는 방법
		@Override    //이 추상 메소드만 재정의해주면 된다.
		public void mouseClicked(MouseEvent e) {
			//2번째 추가
			updateRow = table.getSelectedRow();
			
			//getValueAt(인자값 2개) - 그 행의 열을 가지고 옴
			west.tf[0].setText(
					(String) showTable.table.getValueAt(updateRow, 0));
			west.tf[1].setText(
					(String) showTable.table.getValueAt(updateRow, 1));
			west.tf[2].setText(
					(String) showTable.table.getValueAt(updateRow, 2));
			
			//[중요] 주민번호는 수정 못하게 비활성화 시키자
			west.tf[2].setEditable(false); //수정 불가
		}
	}

	public static void main(String[] args) {
		CustomerManagement cm = new CustomerManagement();
		
	}
	
}
