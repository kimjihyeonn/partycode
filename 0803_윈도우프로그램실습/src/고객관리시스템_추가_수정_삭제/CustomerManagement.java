package �������ý���_�߰�_����_����;
/**
 * <<���� �̷�(Modification Infomation) >> 
 *    ������                                   ������                   ��������
 *  ========               =====         ======
 *  2021.08.03(11:42)      ������                 UI ��
 *  2021.08.04             ������                
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
               //�ܺ� Ŭ����
public class CustomerManagement extends JFrame {
	
	
	//[��ġ �߿�] => 4���� ���� Ŭ������ü ���� => �۷ι� (����)����
	
	MenuMain menuMain = new MenuMain();
	West west = new West();
	Buttons buttons = new Buttons();
	ShowTable showTable = new ShowTable();
	//[�߿�] �߰�  => �������� ����
	int updateRow;// ���� ����� �ϱ� ���ؼ� �ʿ��� ���������̴�. 0���� �ڵ��ʱ�ȭ�ȴ�.
	
	//������ ���� =>�ܺ� Ŭ���� ��
	public CustomerManagement() {
		setTitle("�������ý���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//����Ŭ���� ȭ�� ������ġ BorderLayout ��ġ
		add(menuMain.mb, BorderLayout.NORTH);
		add(west,BorderLayout.WEST);
		add(buttons,BorderLayout.SOUTH);
		add(showTable.scrollPane,BorderLayout.CENTER);
		
		
		
		setSize(600,300);
		setLocation(700, 300);
		setVisible(true);
		
		

		
	}
	//MenuMain ����Ŭ���� ����  ����	
	//����� ���� ���� �ϳ��� Ŭ������ ��Ӱ��� ���߻�� ���(x),�������̽��� �������� ������ų �� �ִ�.
	class MenuMain extends JPanel 
	implements ActionListener,ItemListener
	{  //������ü �������� ����
		JMenuBar          mb;
		JMenu             file,sort,help;
		JMenuItem         fopen,fsave,fexit,proinfo;
		JCheckBoxMenuItem  sname;
		
		FileDialog readOpen, saveOpen;
		String fileDir, fileName,readFileName,saveFileName;
		
		
		//������
		public MenuMain() {
			mb = new JMenuBar();
			file =new JMenu("����");
			sort =new JMenu("����");
			help= new JMenu("����");
			
			fopen = new JMenuItem("����");
			fsave = new JMenuItem("����");
			fexit = new JMenuItem("�ݱ�");
			
			sname = new JCheckBoxMenuItem("�̸�");
			
			proinfo = new JMenuItem("���α׷� ����");
			
					
			
			file.add(fopen);
			file.add(fsave);
			file.add(fexit);
			
			sort.add(sname);
			help.add(proinfo);
			
			mb.add(file); mb.add(sort); mb.add(help);
			
			//���۳�Ʈ�� �̺�Ʈ�ڵ鷯 ������ ��ü ����(���)
			//addXxxListener()
			fopen.addActionListener(this);
			fsave.addActionListener(this);
			fexit.addActionListener(this);
			sname.addItemListener(this);
			
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("����")) save();// ����� ���� �޼ҵ� ȣ��
			else if(e.getActionCommand().equals("����")) open();
			else if(e.getActionCommand().equals("�ݱ�")) exit();
			
			
			
			
		}
		public void save() {
			saveOpen = new FileDialog(CustomerManagement.this, "��������", FileDialog.SAVE);
			
			saveOpen.setVisible(true);
			fileDir = saveOpen.getDirectory();
			fileName = saveOpen.getFile();
			saveFileName= fileDir+"//"+fileName;
			
			String str = "";
			String temp = "";
			
			try {
				BufferedWriter save = new BufferedWriter(new FileWriter(saveFileName));
				for(int i=0; i<showTable.table.getRowCount();i++) {
					//[�߿�]
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
			
			readOpen = new FileDialog(CustomerManagement.this,"���� ����",FileDialog.LOAD);
			
			readOpen.setVisible(true);
			fileDir=readOpen.getDirectory();
			fileName=readOpen.getFile();
			readFileName=fileDir+"//"+fileName;
			try {
				BufferedReader read = new BufferedReader(new FileReader(readFileName));
				String line = null;
				
				//ȫ�浿, 010-3213-1234, 891024-1241536 ���� ����
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
			
			System.exit(0); //���μ����� ����������Ѷ� 
			
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			// "�̸�"���� �����ϱ�
			
			int rowCount = showTable.table.getRowCount();//table ��ü�� ���ǰ���
			int colCount = showTable.table.getColumnCount();
			/*
			 * �ó����� =>1. ���� table�� �����͸� 2���� �迭�� �ű��
			 *         2. 2���� �迭 ���� ��Ű��
			 *         3. ���Ľ�Ų �����͸� table�� �ű��
			 *   
			 */
		    String[][] arr = new String[rowCount][colCount];
		    String temp;
			for(int i=0;i<rowCount;i++) {
				for(int j=0;j<colCount;j++) {
					arr[i][j]=(String)showTable.table.getValueAt(i, j);
				}
			}
			//2�����迭 ���� => �������� �˰��� ����
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
			//[�Է�] ���� �����
			LineBorder line = new LineBorder(Color.BLUE,2);
			setBorder(new TitledBorder(line, "�Է�"));
			
			String[] text = {"��  ��","�ڵ�����ȣ","�ֹε�Ϲ�ȣ"};
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
		
		
		//������
		public Buttons(){
                     setLayout(new GridLayout(1,3,5,0))	;
                     addBtn = new JButton("�߰�");
                     updateBtn = new JButton("����");
                     delBtn = new JButton("����");
                     addBtn.setBackground(Color.GREEN);
                     updateBtn.setBackground(Color.YELLOW);
                     delBtn.setBackground(Color.LIGHT_GRAY);
                     
                     add(addBtn); add(updateBtn); add(delBtn);
                     
                     addBtn.addActionListener(this);
                     updateBtn.addActionListener(this);
                     delBtn.addActionListener(this);
                     
                     
		}

		@Override  //������
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("�߰�")) addData();//��������� �޼ҵ�
			else if(e.getActionCommand().equals("����")) updateData();
			else if(e.getActionCommand().equals("����")) deleteData();
			
			
			
		} //end actionPerformed() ===========================
		
		public void addData() { //�߰� �۾� ó��
			Vector<String> vector = new Vector<String>();
			vector.add(west.tf[0].getText());
			vector.add(west.tf[1].getText());
			//����ڰ� �Է��� �ֹι�ȣ�� Vector��ü�� �����ϱ� ����
			//��ȿ�� üũ�� �عι�ȣ ���� �����Ͽ� ������ ��쿡�� Vector��ü�� ��������
			//������ �߶� �ҽ��� ã�� �ٿ��ֱ� �սô�.
			juminNo = west.tf[2].getText();
			String regex = "^[0-9]{2}([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])-[1234][0-9]{6}$";
	        boolean check = Pattern.matches(regex, juminNo);
			
			if(check == false) {
				JOptionPane.showMessageDialog(null, "�Էµ� �ֹι�ȣ�� ���� ǥ���� ���Ͽ� ���� �ʽ��ϴ�.", 
						  "��� �޽���", JOptionPane.ERROR_MESSAGE);
				west.tf[2].setText("");
				west.tf[2].requestFocus();
				return; //���� ���� �����ض�! => ����ڰ� �ٽ� �Է� ���� �� ����...
			}
			//���Ͽ� �´� ��� => �ֹι�ȣ üũ ���� ����
			int sum = 0; //���������� �ʱ�ȭ ����
           int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};	
           for(int i=0;i<weight.length;i++) {
   			if(juminNo.charAt(i) =='-')continue;
   			 sum = sum + (juminNo.charAt(i)-48) * weight[i];
   			}
        int   temp= 11-(sum%11);
   		int   result = temp%10;
   		if(result == juminNo.charAt(13)-48) {
   			JOptionPane.showMessageDialog(null, "�ֹι�ȣ üũ ��� �����Դϴ�.");
   			//�ֹι�ȣ�� �����̱� ������ Vector ��ü�� ��������!!
   			vector.add(west.tf[2].getText());
   			
   			west.tf[0].setText(null);
   			west.tf[1].setText(null);
   			west.tf[2].setText(null);
   			west.tf[0].requestFocus();
   			//[�߿�]
   			showTable.data.addElement(vector);
   			//�����Ͱ� ����� �� ��������� JTable�� �����Ϸ��� �� �޼ҵ带  ȣ���ϸ� �ȴ�.
   			showTable.datamodel.fireTableDataChanged();
   		}else { JOptionPane.showMessageDialog(null, "�ֹι�ȣ Ʋ��!!", 
				  "��� �޽���", JOptionPane.ERROR_MESSAGE
				  );
   		
   			
   		}
			
		}
		public void updateData() { //���� �۾� ó��
			
			showTable.table.setValueAt(west.tf[0].getText(), updateRow, 0);
			showTable.table.setValueAt(west.tf[1].getText(), updateRow, 1);
			west.tf[0].setText(null);
   			west.tf[1].setText(null);
   			west.tf[2].setText(null);
   			//�߰� �ֹι�ȣ �Է��� �ޱ� ���ؼ� �ֹι�ȣ JTextField Ȱ��ȭ ��Ű��!!
   			west.tf[2].setEditable(true);
   			west.tf[0].requestFocus();
			
			
		}
		public void deleteData() { //���� �۾� ó��
			int yes_no_select = JOptionPane.showConfirmDialog(null, "���� �����Ͻðڽ��ϱ�","�������� ����",JOptionPane.YES_NO_OPTION);
			
			if(yes_no_select == JOptionPane.YES_OPTION) {
				JTable tb = showTable.table;
				int deleteRow = tb.getSelectedRow();
				
				if(deleteRow == -1) {//������� ���������ʰ� ������ư�� ������� getSelectedRow() -1�� �������ش�.
					return;
				}else { // ������� ������ ���
					DefaultTableModel model= (DefaultTableModel) tb.getModel();
					 model.removeRow(deleteRow);
					 west.tf[0].setText(null);
			   			west.tf[1].setText(null);
			   			west.tf[2].setText(null);
			   			//�߰� �ֹι�ȣ �Է��� �ޱ� ���ؼ� �ֹι�ȣ JTextField Ȱ��ȭ ��Ű��!!
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
		String[] colName = {"�̸�","�ڵ�����ȣ","�ֹε�Ϲ�ȣ"};
		//[�߿�]
		
		Vector<Vector<String>> data;
		Vector<String>     column_name;
		
		
		//������
		public ShowTable() {
			data = new Vector<Vector<String>>();
			column_name = new Vector<String>();
			for(int i = 0; i<colName.length;i++) {
				column_name.add(colName[i]);
			}
			
	    //[�߿�]
			//1. ���� JTable�� ����� ��(Model) ����
			datamodel = new DefaultTableModel(data, column_name);
			
			//2. ������ ���� ���� �����ϸ� ��JTable ����
			table = new JTable(datamodel);
			
			//3. JTable �� �Էµ� data���� ���� ��츦 ����ؼ� ��ũ�ѹٸ� ���δ�.
			scrollPane = new JScrollPane(table);
			
			//����ũ�� ����
			
			table.getColumnModel().getColumn(0).setPreferredWidth(50);
			table.getColumnModel().getColumn(1).setPreferredWidth(100);
			table.getColumnModel().getColumn(2).setPreferredWidth(120);
            //���۳�Ʈ�� �̺�Ʈ�ڵ鷯������ ��ü ����(���)
			table.addMouseListener(this);			
			
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		//2��° �߰� 
		updateRow = table.getSelectedRow();
		
		west.tf[0].setText((String) showTable.table.getValueAt(updateRow, 0));
		west.tf[1].setText((String) showTable.table.getValueAt(updateRow, 1));
		west.tf[2].setText((String) showTable.table.getValueAt(updateRow, 2));
		//[�߿�] �ֹι�ȣ
		west.tf[2].setEditable(false);
	}	

		
 }		

	public static void main(String[] args) {
		CustomerManagement cm = new CustomerManagement();

	}

  
 
   }
	
	

  
	


	
