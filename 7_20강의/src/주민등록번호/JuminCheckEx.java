package �ֹε�Ϲ�ȣ;

import java.util.Calendar;
import java.util.Locale;
/**
 * ����ǥ����(Regular Expression; ���ڷ�regex)��?
 * =>�Էµ� ���ڿ��� ������ �ִ� �������� �Ǿ� �ִ��� �����ϴ� ���� ���Ѵ�.
 *   �̹� ��յ� ��Ÿ���ڸ� �������ش�.
 *   *��Ÿ���ڶ�?
 *   =>���� �� ���ڰ� ���� ���� �ƴ� 'Ư���� �뵵'�� ���Ǵ� ���ڸ� ���Ѵ�.
 *   []=>�� ���� ���� (��) [abc] =>a,b,c �� �ϳ��� ����
 *                    [0-9] => 0���� 9���� �� �ϳ�
 *   
 *   {} => �ݺ�Ƚ��  (��) {6}    =>6�� �ݺ����� 
 *   ^ => ���� ,$=>����
 *   
 *   #�ֹι�ȣ �ڵ�� ���� �߿� ������ �����ϴ� ���
 *   ����
 *   ����
 *   �������
 *   �������
 *   ��
 *   ������ ��å�� �����ϱ� ���ؼ� => promotion
 *   ------------------------------------
 *   
 *   
  */
import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheckEx {

	public static void main(String[] args) {
		//�غ�ܰ�
		int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};//����ġ �ʱ�ȭ
		String juminNum; //juminNum�Է¹��� �ֹι�ȣ ���ڿ� ��ü�� ����Ű�� ����(�ּ�)�����̴�.
		int sum = 0; //���� ������ 0���� �ʱ�ȭ ����.
		int temp, result;
		
		//�Է�
		System.out.print("�ֹι�ȣ �Է�>>>> ");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();
		
		//[����]"791024-1035271"
		/*
		 * �ֹι�ȣ�� �Է¹����� ���� ���� ��ȿ�� üũ�� ����!!
		 * ����ǥ����(Regular Expression=regex) ���� ������ ���ؼ�
		 */
		String regex = "^[0-9]{2}([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])-[1234][0-9]{6}$";
		
		//matches,compareTo,charAt,equals
		//boolean check = juminNum.matches(regex);
		boolean check = Pattern.matches(regex, juminNum);
		
		if(check == false) {
			System.out.println("�Էµ� �ֹι�ȣ�� ����ǥ���� ���Ͽ� ���� �ʽ��ϴ�.");
			return;
		}
		System.out.println("�Էµ� �ֹι�ȣ�� ���� ǥ���� ���Ͽ� �����մϴ�.");
		//ó��
		
	/*	for(int i=0;i<13;i++) {
			if(juminNum.charAt(i) =='-'){
				continue;
			}else {
				sum = sum + (juminNum.charAt(i)-48) * weight[i];
			}
			
		}*/
		
		for(int i=0;i<weight.length;i++) {
			if(juminNum.charAt(i) =='-')continue;
			 sum = sum + (juminNum.charAt(i)-48) * weight[i];
			}
			//System.out.println(sum);
		temp= 11-(sum%11);
		result = temp%10;
		if(result == juminNum.charAt(13)-48) {
			System.out.println("�ֹι�ȣ �����Դϴ�.");
			/*
			 * #���� �����ϱ� => �ó������� ���;� �Ѵ�.
             *   1.�ý������� ���� ���� �⵵ ���� => 2021
             *   2.�ֹι�ȣ�� �� ���ڸ� ��������=> "97"=>���� 97�� ��ȯ
             *   3.�ֹι�ȣ�� 7��¥�ڸ� ��������
             *   1,2�� +1900, 3,4�� +2000
             *   4.2021-1997= ����
			 */
			Calendar cal= Calendar.getInstance(Locale.KOREA);
			int year = cal.get(Calendar.YEAR); //2021 ����
			//substring(0,2)�� �ǹ̴� end index(2) - beginIndex(0)�� �� �ڸ��� ��ŭ ������
			//charAt,matches,equals,substring,comepareTo
			int yy= Integer.parseInt(juminNum.substring(0,2));//"97"=>����97
			if((juminNum.charAt(7)-'0') < 3) {
				yy = yy+1900;
				
			}else
			{
				yy= yy+2000;
			}
			int age= year-yy+1; // ���� ����
			System.out.println("���� :"+age);
			
			//'����' ����
			if((juminNum.charAt(7)-'0')%2 == 0) { //2,4�� ��� =>����
				System.out.println("���� : ����");
				
			}else {
				System.out.println("���� : ����");
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
			
			String localeString = juminNum.substring(8, 10);
			int locale = Integer.parseInt(localeString);
			String birthPlace = null;
			
			for(int j=0;j<=localeCode.length-1;j++) {
				if(locale >=Integer.parseInt(localeCode[j][1]) && locale <=Integer.parseInt(localeCode[j][2])) {
					birthPlace = localeCode[j][0];
					
				}
				
			}
			System.out.println("�������:"+birthPlace);
			
			//'������� ���'
			
		
			
			System.out.println("�������:" +yy+"/"+juminNum.substring(2,4)+"/"+juminNum.substring(4,6));
			
			
			//'��' ���� => ����⵵��%12 =������ ���� 
			String ddi = null;
			String[] gangi = {"������","��","��","����","��","��","��","�䳢","��","��","��","��"};
			ddi = gangi[yy%12];
			System.out.println("��:"+ddi);
			
		}else {
			System.out.println("Ʋ�� �ֹε�� ��ȣ�Դϴ�.");
		}
		}
		
		
		
  

	}


