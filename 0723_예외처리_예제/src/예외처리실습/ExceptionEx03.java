package ����ó���ǽ�;

public class ExceptionEx03 {

	public static void main(String[] args) {
	try {String[] str = {"10","20","30"};
	 
	 int data = Integer.parseInt(str[1]); //"20" =>20 ��ȯ
	 System.out.println(data);}
	catch(Exception e){
		System.out.println( "���������" + e);
		
	}
	 
	 

	}

}
