package exception.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsEx {
	
	
	public static void main(String[] args) {
		
		//throws - �޼��忡�� �߻��� ������ ȣ��η� �Ѱ��ݴϴ�.
		//throws�� ���� �޼���� ȣ��ÿ� ��� ����ó���� �����մϴ�.
		
		try {
			greeting(4);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//throws�� ��ǥ���� �޼���
		try {
			Class.forName("xxx");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			new FileOutputStream(new File("xx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	static String[] arr = {"��Ծ���?","helloworld","�����ȷҾ�"};
	public static void greeting(int index) throws Exception {
		
		System.out.println(arr[index]);
		
	}
}
