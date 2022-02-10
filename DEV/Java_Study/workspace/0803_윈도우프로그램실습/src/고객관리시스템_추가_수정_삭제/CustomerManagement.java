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
import java.util.Calendar;
import java.util.Locale;
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
 * <<���� �̷�(Modification Information) >>
 * 
 *   ������                                  ������               �۾� �� ���� ����
 *  ======              ======     		========
 *  2021.08.03(11:42)   ������                UI(����� �������̽�) ����/�м�/����
 *  2021.08.04          ������                �̺�Ʈ ó��(�߰�,����,����,����,�ҷ�����,�ݱ�,�̸� ����)���
 *  2021.08.05			������		ȸ����ȣ,�̸���(west&center),����,����,�������,����,����(center)
 *  								����,����,�˻� ��ư(bottom)
 */

             //�ܺ� Ŭ����
public class CustomerManagement extends JFrame {
	
	//[��ġ�߿�] => 4���� ���� Ŭ���� ��ü ���� => �۷ι�(����) ��ü ��������
	//�޼ҵ� �ȿ� ������ ���� �ʾұ� ������ ����(global)����, ��� �������� ���ٰ���
	//1. Ŭ���� �̸� ����
	MenuMain menuMain = new MenuMain();
	West west = new West();
	West wb = new West();
	Buttons buttons = new Buttons();
	ShowTable showTable = new ShowTable();
	
	//[�߿�] ù��° �߰� => �������� ����
	int updateRow; //������ ���� ����� �ϱ� ���ؼ� �ʿ��� ���������̴�. 0���� �ڵ��ʱ�ȭ�ȴ�.
	
	//������ ���� => �ܺ� Ŭ���� ��
	public CustomerManagement() {	  
		      // (4) ���̺� ����: �빮�ڷ� �����ϴ� ����
		      OUTTER: while(true) {   // ���� ����
		         ImageIcon icon = new ImageIcon("src/images/����������_�̹���.jpg");         
		         // �̹��� ��ü�κ��� �̹��� �������� �����Ѵ�. ���ڰ� String
		         
		         // (5) �˾� ���̾�α� ����� : ��Ʈ�� â�� ���� ��
		         JOptionPane.showMessageDialog(null, null, "�����������ý���", JOptionPane.NO_OPTION, icon);
		         
		         // (6) �н����� �Է¹޾� ����ó�� ��ȭ ���� �����
		         String password = JOptionPane.showInputDialog("�������ý���"+"\n"+"�н����� �Է�"); // ������ �ý��� ���� �����ְ� �ٹٲ㼭 �н����� �Է��� �����
		         
		         String passwd = "1234"; // �н����� ����
		         // password  : ����ڰ� �Է��ϴ� �н����带 �޴´�
		         // passwd: ������ �н�����
		         
		         if(password == null) { // ����ڰ� �н����带 �Է����� �ʴ� ���
		            break;
		         }else if(password.equals(passwd)) { // ����ó�� ����! �н����� ��ġ
		        	 setTitle("������ �ý���");
		     		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     		
		     		
		     		//���� Ŭ���� ȭ�� ���� BorderLayout ��ġ
		     		//�޴��ٸ� BorderLayout ���ʿ� ��ġ�϶�
		     		add(menuMain.mb, BorderLayout.NORTH);
		     		add(west, BorderLayout.WEST);
		     		add(buttons, BorderLayout.SOUTH);
		     		//[����] scrollPane�� �ٿ��� �Ѵ�.
		     		add(showTable.scrollPane, BorderLayout.CENTER);
		     		
		     		/*
		     		 * menuMain.mb�� showTable.scrollPane�� �ٿ����Ѵ�.
		     		 */
		     		
		     		//������
		     		setSize(1600, 900);
		     		setLocation(700, 300);
		     		setVisible(true);
		            break OUTTER;
		         }else { // ����ó�� ����! �н����尡 �߸��� ���
		            JOptionPane.showMessageDialog(null
		                                   , "�н����尡 ���� �ʽ��ϴ�"+"\n"+"'Ȯ��' ��ư�� ��������!" // Ȯ�� ��ư�� �ְ� ���� ��� '' ��� 
		                                   , "�����޽���"
		                                   , JOptionPane.ERROR_MESSAGE);
		            continue OUTTER; // �� ���̺��� ��� �����϶�
		         }
		         
		      } // end OUTTER
		   
		   } // end IntroPassword() 
	//���� Ŭ������ �ܺ� Ŭ���� �ȿ� ����
	//MenuMain ���� Ŭ���� ����/����
	//�ڹٴ� �ϳ��� Ŭ������ ��Ӱ��� ���߻�� ������
	//�������̽��� �������� ������ų �� �ִ�.
	class MenuMain extends JPanel
	implements ActionListener, ItemListener {
		//���� ��ü �������� ����
		JMenuBar 	mb;
		JMenu		file, sort, help;
		JMenuItem	fopen, fsave, fexit, proinfo;
		JCheckBoxMenuItem 	sname; //�̸� ����
		
		FileDialog readOpen, saveOpen;
		String 	   fileDir, fileName, readFileName, saveFileName;
		
		
		//������
		public MenuMain() {
			mb = new JMenuBar();
			
			file = new JMenu("����");
			sort = new JMenu("����");
			help = new JMenu("����");
			
			fopen = new JMenuItem("����");
			fsave = new JMenuItem("����");
			fexit = new JMenuItem("�ݱ�");
			
			sname = new JCheckBoxMenuItem("�̸�");
			
			proinfo = new JMenuItem("���α׷� ����");
			
			
			//��ü�� JPanel(���� �����̳�)�� ���̱�
			file.add(fopen); file.add(fsave); 
			file.addSeparator(); file.add(fexit);
			sort.add(sname);
			help.add(proinfo);
			
			mb.add(file); mb.add(sort); mb.add(help);
			
			//���۳�Ʈ�� �̺�Ʈ�۵鷯������ ��ü ����
			//addXxxListener();
			fopen.addActionListener(this);
			fsave.addActionListener(this);
			fexit.addActionListener(this);
			
			sname.addItemListener(this);
		}
		//�޼ҵ� ������
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("����")) save();//��������Ǹ޼ҵ�ȣ��
			else if(e.getActionCommand().equals("����")) open();
			else if(e.getActionCommand().equals("�ݱ�")) exit();
		}
		
		//'����' ��� ó�� �޼ҵ�
		public void save() {
			saveOpen 
			= new FileDialog(CustomerManagement.this, 
								"���� ����", FileDialog.SAVE);
			saveOpen.setVisible(true);
			
			fileDir = saveOpen.getDirectory();
			fileName = saveOpen.getFile();
			readFileName = fileDir + "//" + fileName;
			
			//�޸���� �ٸ� �κ�
			String str = "";
			String temp = "";
			
			//���Ͽ� ���� �� �ݵ�� ����ó�� ���ش�.
			try {
				BufferedWriter save 
				= new BufferedWriter(new FileWriter(saveFileName));
				//Vector, ArrayList�� �����迭(������ �����ϸ� �ڵ����� �þ��.)
				for(int i=0; i<showTable.table.getRowCount(); i++) {
					//[�߿�]
					temp = showTable.data.elementAt(i).toString();
					//[ȫ�浿, 010-3213-1234, 891024-1241536]
					str = str + temp.substring(1, temp.length()-1) + "\n";
				}
				save.write(str);
				save.close();   //�ڿ�����
			}
			catch(IOException ex) {
				System.out.println(ex);
			}
		}
		
		//'����' ��� ó�� �޼ҵ�
		public void open() {
			StringTokenizer 	st;
			Vector<String>  	vec;
			
			readOpen 
			= new FileDialog(CustomerManagement.this, 
								"���� ����", FileDialog.LOAD);
			readOpen.setVisible(true);
			
			fileDir = readOpen.getDirectory();
			fileName = readOpen.getFile();
			readFileName = fileDir + "//" + fileName;
			
			//�޸���� �ٸ� �κ�
			String str = "";
			String temp = "";
			
			//���Ͽ� ���� �� �ݵ�� ����ó�� ���ش�.
			try {
				BufferedReader read 
				= new BufferedReader(new FileReader(readFileName));
				String line = null;
				//ȫ�浿, 010-3213-1234, 891024-1241536 : �޸� ������ ������
				//ȫ�浿, 010-3213-1234, 891024-1241536 �̰� line���� �����
				//���ǽ��� true�̸� �ݺ�
				while((line = read.readLine()) != null) {
					st = new StringTokenizer(line, ", ");
					
			//st�� ����� ��ū���� JTable�� �ѷ��ֱ�
					vec = new Vector<String>();
					
					while(st.hasMoreTokens()) {
						vec.add(st.nextToken());
					}
					showTable.data.addElement(vec);
				}
				showTable.datamodel.fireTableDataChanged();
				read.close();   //�ڿ�����
			}
			catch(IOException ex) {
				System.out.println(ex);
			}
			
		}
		//'�ݱ�' ��� ó�� �޼ҵ�
		public void exit() {
			System.exit(0);  //���α׷� ���� ����
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			//'�̸�'���� �����ϱ�
			//getRowCount : ���̺��� ���� ���� �ҷ����� �޼ҵ�, table ��ü�� ���� ����===
			int rowCount = showTable.table.getRowCount(); 
			//table ��ü�� ���� ���� ������=====================================
			int colCount = showTable.table.getColumnCount();
			
	/*
	 * �ó����� => 1. ���� table�� �����͸� ������ �迭�� �ű��
	 * 			2. ������ �迭 ���Ľ�Ű��
	 * 			3. ���Ľ�Ų �����͸� table�� �ű��
	 */
			//1. ������ �迭 ��ü �����, arr[][] == [][]arr
			String[][] arr = new String[rowCount][colCount];
			String temp;
			
			for(int i=0; i<rowCount; i++) {
				for(int j=0; j<colCount; j++) {
					arr[i][j] 
							= (String)showTable.table.getValueAt(i, j);
				}
			}
			//2. 2���� �迭 ���� => ���� ���� �˰��� ����
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
			//3. ���Ľ�Ų �����͸� table�� �ű��
			for(int i=0; i<rowCount; i++) {
				for(int j=0; j<colCount; j++) {
				showTable.table.setValueAt(arr[i][j], i, j);
				}
			}
		}
	}
	
	//West ���� Ŭ���� ����/����
	class West extends JPanel{
		JLabel 			la;
		
		// ���� Ŭ����
		Input input = new Input();		// '�Է�' ����
		Output output = new Output();	// '�Ż�����' ����
		
		
		//������
		public West() {
			//�߰�
			
			setLayout(new BorderLayout());
			add(input, BorderLayout.CENTER);
			add(output, BorderLayout.SOUTH);
			
			
			
		}
		// ����Ŭ���� �ȿ� ����Ŭ������ �� �ִ�.
		class Input extends JPanel{

			JTextField[]	tf;
			JComboBox<String> box;
			JLabel job;
			

			// ������
			public Input() {
				//[�Է�]Border�����
				LineBorder line = new LineBorder(Color.BLUE, 2);
				setBorder(new TitledBorder(line, "�Է�"));
				String[] text = {"��ȣ", "�̸�", "�ڵ�����ȣ", "�̸���", "�ֹε�Ϲ�ȣ"};
				job = new JLabel("����");
				String[] text2 = {"ȸ���","������","����","�ǻ�",
								  "������","�л�"};
				box = new JComboBox<String>(text2);
				
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
			JTextField[]	tff;
			public Output() {
				LineBorder line = new LineBorder(Color.BLUE, 2);
				setBorder(new TitledBorder(line, "�Ż�����"));
				String[] text = {"����", "����", "�������", "����"};
				tff = new JTextField[5];
				setLayout(new GridLayout(4,1,5,10));
				
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
	
	//Buttons ���� Ŭ���� ����/����
	class Buttons extends JPanel implements ActionListener{
		Vector<String> vector;
		JButton		   addBtn, updateBtn, preBtn, nextBtn, findBtn, delBtn;  //��������
		String 			juminNo; //�ֹι�ȣ
		
		//������
		public Buttons() {
			//						1�� 3��    ����
			setLayout(new GridLayout(1, 6, 5, 0)); 
			
			//��ư ����
			addBtn = new JButton("�߰�");
			delBtn = new JButton("����");
			updateBtn = new JButton("����");
			preBtn = new JButton("����");
			nextBtn = new JButton("����");
			findBtn = new JButton("�˻�");
			
			
			//��ư��
			addBtn.setBackground(Color.YELLOW);
			delBtn.setBackground(Color.LIGHT_GRAY);
			updateBtn.setBackground(Color.pink);
			findBtn.setBackground(Color.GREEN);
			
			//JPanel�� ���̱�
			add(addBtn); add(delBtn); add(preBtn); add(nextBtn); add(updateBtn); add(findBtn);
			
			//���۳�Ʈ�� �̺�Ʈ�ڵ鷯������ ��ü ����(���)
			addBtn.addActionListener(this);
			updateBtn.addActionListener(this);
			delBtn.addActionListener(this);
			preBtn.addActionListener(this);
			nextBtn.addActionListener(this);
			findBtn.addActionListener(this);
			//��������� �����ڰ� �ؾ��� ��
		}
		
		//������, �ڽ� Ŭ������ �°� ������ �϶�
		@Override
		public void actionPerformed(ActionEvent e) {
			//���� e�� ���� ���� "�߰�"���, equals: ���ڿ� ����
			if(e.getActionCommand().equals("�߰�")) 
				addData();//����� ���� �޼ҵ�
			else if(e.getActionCommand().equals("����")) updateData();
			else if(e.getActionCommand().equals("����")) deleteData();
			
		} //end actionPerformed =======================================
		//addData���� �߰� �۾� ����
		public void addData() { //�߰� �۾��� �����! ����, ���� ������ �ƴ�
			Vector<String> vector = new Vector<String>();
			
			//����ڰ� �Է��� ���� �� ����
			vector.add(west.input.tf[0].getText());//�̸�
			vector.add(west.input.tf[1].getText());//�ڵ�����ȣ
			vector.add(west.input.tf[2].getText());
			vector.add(west.input.tf[3].getText());
			vector.add(west.input.tf[4].getText());
			vector.add(west.input.box.getSelectedItem().toString());
			
			
			
			//����ڰ� �Է��� �ֹι�ȣ�� Vector ��ü�� �����ϱ� ����
			//��ȿ�� üũ�� �ֹι�ȣ ���� �����Ͽ� ������ ��쿡�� Vector ��ü�� ��������
			//������ �ߴ� �ҽ��� ã�� �ٿ��ֱ� �սô�.
			juminNo = west.input.tf[4].getText();
			
			//����ǥ���� ���� => ������ ��ȿ�� üũ�ϱ� ���ؼ�
			String regex = "^[0-9]{6}-[1234][0-9]{6}$";
			boolean check = Pattern.matches(regex, juminNo);
			
			//���Ͽ� ���� ���� ���
			if(check == false) { //������ ���α׷����� ���
				//showMessageDialog - ���� �޼ҵ�(Ŭ���� ������ �ʿ� ����)
				JOptionPane.showMessageDialog(null, 
											"�Էµ� �ֹι�ȣ�� ���� �ʽ��ϴ�", 
											"��� �޼���", 
											JOptionPane.ERROR_MESSAGE);
				west.input.tf[4].setText(null); //Ʋ�� �ֹι�ȣ�� ����
				west.input.tf[4].requestFocus();
				return;  //���ݻ��� ���� => ����ڰ� �ٽ� �Է��� ������
			}
			//���Ͽ� �´� ��� => �ֹι�ȣ üũ ���� ����
			int sum = 0; //�޼ҵ� �ȿ��� ���� -> �������� => ���� ������ �ʱ�ȭ
			int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5}; //����ġ �ʱ�ȭ
			for(int i=0; i<13; i++) {
				if(juminNo.charAt(i) == '-') continue;			
					sum = sum + (juminNo.charAt(i)-48) * weight[i];			
			}
			//System.out.println(sum);
			
			int temp = 11 - (sum%11);   //temp���� 10 �Ǵ� 11�� �ֹι�ȣ�� �ִ�.
			int result = temp%10;
			
			if(result == juminNo.charAt(13)-48) {
				JOptionPane.showMessageDialog(null, 
						"�ֹι�ȣ üũ ��� �����Դϴ�.");
				
				//�ֹι�ȣ�� �����̱� ������ Vector ��ü�� ��������!!
				vector.add(west.input.tf[4].getText());
				
				Calendar cal= Calendar.getInstance(Locale.KOREA);
				int year = cal.get(Calendar.YEAR); //2021 ����
				//substring(0,2)�� �ǹ̴� end index(2) - beginIndex(0)�� �� �ڸ��� ��ŭ ������
				//charAt,matches,equals,substring,comepareTo
				int yy= Integer.parseInt(juminNo.substring(0,2));//"97"=>����97
				int month = Integer.parseInt(juminNo.substring(2, 4));
				int day = Integer.parseInt(juminNo.substring(4,6));
				if((juminNo.charAt(7)-'0') < 3) {
					yy = yy+1900;
					
				}else
				{
					yy= yy+2000;
				}
				int age= year-yy+1; // ���� ����
				String age2= Integer.toString(age);
				String yy2=Integer.toString(yy);
				west.output.tff[0].setText(age2);
				west.output.tff[3].setText(year+"��" + month+"��"+day+"��");
				vector.add(west.output.tff[0].getText());
				vector.add(west.output.tff[3].getText());
				
				//'����' ����
				if((juminNo.charAt(7)-'0')%2 == 0) { //2,4�� ��� =>����
					west.output.tff[1].setText("����");
					vector.add(west.output.tff[1].getText());
					
				}else {
					west.output.tff[1].setText("����");
					vector.add(west.output.tff[1].getText());
				}
				
				//'�������' ����
				/*����:00~08
				 * �λ�:09~12
				 * ��õ:13~15
				 * ���:16~25
				 * ����:26~34
				 * ���:35~39
				 * ����:40
				 * �泲:41~43,45~47
				 * ����:44,96
				 * ����:48~54
				 * ����:55~64
				 * ����:65~66
				 * �뱸:67~70
				 * ���:71~80
				 * �泲:81~84,86~90
				 * ���:85
				 * ����:91~95(Ư����ġ��)
				 * 
				 */
				
				//2���� �迭�� �ʱ�ȭ ��Ű��
				String[][] localeCode = {{"����","00","08"},{"�λ�","09","12"},{"��õ","13","15"},{"���","16","25"},
				{"����","26","34"},{"���","35","39"},{"����","40","40"},{"�泲","41","43"},{"�泲","45","47"},{
					"����","44","44"},{"����","96","96"},{"����","48","54"},{"����","65","66"},{"�뱸","67","70"}
					,{"���","71","80"},{"�泲","81","84"},{"�泲","86","90"},{"���","85","85"},{"����","91","95"}
				};
				
				String localeString = juminNo.substring(8, 10);
				int locale = Integer.parseInt(localeString);
				String birthPlace = null;
				
				for(int j=0;j<=localeCode.length-1;j++) {
					if(locale >=Integer.parseInt(localeCode[j][1]) && locale <=Integer.parseInt(localeCode[j][2])) {
						birthPlace = localeCode[j][0];
						
					}
					
				}
				
				west.output.tff[2].setText(birthPlace);
				vector.add(west.output.tff[2].getText());
				
				
				west.input.tf[0].setText(null);
				west.input.tf[1].setText(null);
				west.input.tf[2].setText(null);
				west.input.tf[3].setText(null);
				west.input.tf[4].setText(null);
				
				west.input.tf[0].requestFocus();
				
				//[�߿�] ��ȣ �ۿ�
				showTable.data.addElement(vector);//Element = ��ü
				//�����Ͱ� ����� �� ��������� JTable�� �����Ϸ��� �� �޼ҵ带 ȣ���ϸ� �ȴ�.
				showTable.datamodel.fireTableDataChanged();//��ȭ �ν�
			}
			else { //�ֹι�ȣ�� �������� ���� ���
				JOptionPane.showMessageDialog(null, 
											"�ֹι�ȣ Ʋ��", 
											"��� �޼���", 
											JOptionPane.ERROR_MESSAGE);
				west.input.tf[4].setText(null);
				west.input.tf[4].requestFocus();
			}
		}
		
		public void updateData() { //����� ���� �޼ҵ�, ���� �۾� ó��
			//'�̸�' ���� �� => table ��ü �����ϱ�
	//showTable.table.setValueAt(west.tf[0].getText(), ������(�۷ι�), 0);
	//setValueAt(������ ���, ��, ��) -  ������ ����� ���� �� ���� ������ ���ΰ�.
			showTable.table.setValueAt(west.input.tf[0].getText(), updateRow, 0);
			
			//'�ڵ��� ��ȣ' ���� �� => table ��ü �����ϱ�
			showTable.table.setValueAt(west.input.tf[1].getText(), updateRow, 1);
			showTable.table.setValueAt(west.input.tf[2].getText(), updateRow, 2);
			showTable.table.setValueAt(west.input.tf[3].getText(), updateRow, 3);
			showTable.table.setValueAt(west.input.tf[4].getText(), updateRow, 4);
			showTable.table.setValueAt(west.input.box.getSelectedItem().toString(), updateRow, 5);
			showTable.table.setValueAt(west.output.tff[0].getText(), updateRow, 6);
			showTable.table.setValueAt(west.output.tff[1].getText(), updateRow, 7);
			showTable.table.setValueAt(west.output.tff[2].getText(), updateRow, 8);
			showTable.table.setValueAt(west.output.tff[3].getText(), updateRow, 9);
			
			west.input.tf[0].setText(null);
			west.input.tf[1].setText(null);
			west.input.tf[2].setText(null);
			west.input.tf[3].setText(null);
			west.input.tf[4].setText(null);
			
			//�߰� �ֹι�ȣ�� �Է¹ޱ� ���ؼ� �ֹι�ȣ JTextField Ȱ��ȭ ��Ű��!!
			west.input.tf[4].setEditable(true);
			west.input.tf[0].requestFocus();
		}
		
		public void deleteData() { //���� �۾� ó��
			//��, �ƴϿ��� �� Ȯ��â(confirm), ��ȯŸ�� int�̱� ������ int ������ ����
			int yes_no_select = JOptionPane.showConfirmDialog
					(null, "���� �����Ͻðڽ��ϱ�?", 
							"�� ������ ����", JOptionPane.YES_NO_OPTION);
			
			if(yes_no_select == JOptionPane.YES_OPTION) {
				JTable tb = showTable.table;
				//getSelectedRow�� �������� ������ �������� ��ȯ�Ѵ�.
				int deleteRow = tb.getSelectedRow();
				
				//����ڰ� � �൵ �������� �ʰ� '����' ��ư�� ������ getSelectedRow()
				//�޼ҵ�� -1�� ��ȯ(����)�Ѵ�.
				if(deleteRow == -1) {
					return;
				}
				else {//����ڰ� � ���� ������ ���
					DefaultTableModel model = 
							(DefaultTableModel) tb.getModel();
					model.removeRow(deleteRow);
					
					west.input.tf[0].setText(null);
					west.input.tf[1].setText(null);
					west.input.tf[2].setText(null);
					west.input.tf[3].setText(null);
					west.input.tf[4].setText(null);
					west.output.tff[0].setText(null);
					west.output.tff[1].setText(null);
					west.output.tff[2].setText(null);
					west.output.tff[3].setText(null);
					
					//�߰� �ֹι�ȣ�� �Է¹ޱ� ���ؼ� �ֹι�ȣ JTextField Ȱ��ȭ ��Ű��!!
					west.input.tf[4].setEditable(true);
					west.input.tf[0].requestFocus();
				}
			}
			else {
				return;
			}
		}
	}
	
	//ShowTable ���� Ŭ���� ����/ ����
	//���콺 �̺�Ʈ �߻�
	//JPanel�� ������� �ʴ´�.
	class ShowTable extends MouseAdapter{
		DefaultTableModel   datamodel;
		JTable				table;
		JScrollPane			scrollPane;
		
		String[] colName = {"��ȣ","�̸�","�ڵ��� ��ȣ","E-mail",
							"�ֹε�� ��ȣ","����","����","����","�������","����"};
		
		//[�߿�]
		Vector<Vector<String>> data;
		Vector<String> 		   column_name;
		
		
		//������
		public ShowTable() {
			//�ڷ� ���� ����
			data = new Vector<Vector<String>>();
			column_name = new Vector<String>();
			
			for(int i=0; i<colName.length; i++) {
				column_name.add(colName[i]);
			}
			
			//[�߿�]
			//1. ���� JTable�� ����� ��(Model) ����
			datamodel = new DefaultTableModel(data, column_name);
			
			//2. ������ ���� ���� �����Ͽ� JTable ����
			//1�� ������ 2�� �Ű������� ��
			table = new JTable(datamodel);
			
			//3. JTable�� �Էµ� data���� ���� ��츦 ����� ��ũ�ѹٸ� ���δ�.
			//2�� ������ 3�� �Ű������� ��
			scrollPane = new JScrollPane(table);
			
			//���� ũ�� ����
			table.getColumnModel().getColumn(0).setPreferredWidth(50); //�̸�
			table.getColumnModel().getColumn(1).setPreferredWidth(100); //�ڵ�����ȣ
			table.getColumnModel().getColumn(2).setPreferredWidth(120); //�ֹε�Ϲ�ȣ
			table.getColumnModel().getColumn(3).setPreferredWidth(120);
			table.getColumnModel().getColumn(4).setPreferredWidth(120);
			table.getColumnModel().getColumn(5).setPreferredWidth(120);
			table.getColumnModel().getColumn(6).setPreferredWidth(120);
			table.getColumnModel().getColumn(7).setPreferredWidth(120);
			table.getColumnModel().getColumn(8).setPreferredWidth(120);
			table.getColumnModel().getColumn(9).setPreferredWidth(120);
			
			//���۳�Ʈ�� �̺�Ʈ�ڵ鷯������ ��ü ����(���)
			table.addMouseListener(this);
		}
		
		//�߻�޼ҵ� ������
		//�������� �������̵� ��Ű�� ���
		@Override    //�� �߻� �޼ҵ常 ���������ָ� �ȴ�.
		public void mouseClicked(MouseEvent e) {
			//2��° �߰�
			updateRow = table.getSelectedRow();
			
			//getValueAt(���ڰ� 2��) - �� ���� ���� ������ ��
			west.input.tf[0].setText(
					(String) showTable.table.getValueAt(updateRow, 0));
			west.input.tf[1].setText(
					(String) showTable.table.getValueAt(updateRow, 1));
			west.input.tf[2].setText(
					(String) showTable.table.getValueAt(updateRow, 2));
			west.input.tf[3].setText(
					(String) showTable.table.getValueAt(updateRow, 3));
			west.input.tf[4].setText(
					(String) showTable.table.getValueAt(updateRow, 4));
			west.input.box.setSelectedItem(
					(String) showTable.table.getValueAt(updateRow, 5));
			west.output.tff[0].setText(
					(String) showTable.table.getValueAt(updateRow, 6));
			west.output.tff[1].setText(
					(String) showTable.table.getValueAt(updateRow, 7));
			west.output.tff[2].setText(
					(String) showTable.table.getValueAt(updateRow, 8));
			west.output.tff[3].setText(
					(String) showTable.table.getValueAt(updateRow, 9));
			
			
			//[�߿�] �ֹι�ȣ�� ���� ���ϰ� ��Ȱ��ȭ ��Ű��
			west.input.tf[4].setEditable(false); //���� �Ұ�
		}
	}

	public static void main(String[] args) {
		CustomerManagement cm = new CustomerManagement();
		
	}
	
}
