package api.string;

import java.util.Arrays;

public class StringEx {
	
	
	public static void main(String[] args) {
		String  str = "�ȳ��ϼ���";
		
		
		String str2 = new String("�ȳ��ϼ���");
		
		char[] arr = {'��','��'};
		
		String str3 = new String(arr);
		
		char c = str.charAt(1);
		System.out.println(c);
		//���ڿ��ڸ���
		
		String str4 = "�ڹٴ� �� �̸��� �ڹ��ϱ��? �ڹ��� ����� Ŀ�����Դϴ�.";
		
		String str5=str4.substring(4); //4�̸� ����
		
		System.out.println(str5);
		
		String str6 = str4.substring(0, 7); // 4~7���� ����
		System.out.println(str6);
		
		String str7 = "010-300-3908";
		String[] str9 = str7.split("-");
		System.out.println(str9[0]);
		System.out.println(Arrays.toString(str9));
	
		
		//���ڿ� ġȯ(���� ���ڿ��� ����)
		
		str4=str4.replace(" ", "");
		System.out.println(str4);
		
		Object obj = new String();
		
		
	}

}
