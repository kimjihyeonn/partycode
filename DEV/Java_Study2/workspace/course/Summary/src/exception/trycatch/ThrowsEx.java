package exception.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsEx {
	
	
	public static void main(String[] args) {
		
		//throws - 메서드에서 발생된 에러를 호출부로 넘겨줍니다.
		//throws가 붙은 메서드는 호출시에 대신 에러처리를 진행합니다.
		
		try {
			greeting(4);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//throws의 대표적인 메서드
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

	
	static String[] arr = {"밥먹었어?","helloworld","니취팔롬아"};
	public static void greeting(int index) throws Exception {
		
		System.out.println(arr[index]);
		
	}
}
