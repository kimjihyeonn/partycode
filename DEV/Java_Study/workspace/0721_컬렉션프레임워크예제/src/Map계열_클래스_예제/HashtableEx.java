package Map계열_클래스_예제;

import java.util.Hashtable;
import java.util.Scanner;

/*            키     값
 *  로그인 사례=> ID, Password
 */

public class HashtableEx {

	public static void main(String[] args) {
		//ID,Password 객체 생성
		String[] userID= {"Lee","Kim","Jang","Wang","Ha"};
		String[] password= {"L123","K456","J234","W879","H12345"};
		
        //Hashtable 객체 생성
		Hashtable<String, String> ht 
		       = new Hashtable<String, String>(5);
		
		
		
		//ID, Password를 객체에 추가작업
		for(int i=0; i<5; i++) {
			ht.put(userID[i], password[i]);
			
		
		}
		
		System.out.println(ht);
		//{Jang=J234, Ha=H12345, Lee=L123, Wang=W879, Kim=K456}
		//인증 처리
		
		boolean FLAG =true;  //스위치 변수=> 대문자로하자! 관례
        while(FLAG) {
        	System.out.print("유저 ID는 >>>");
        	Scanner scan = new Scanner(System.in);
        	String user_key = scan.next();
        	String pw_value = ht.get(user_key);
        	
        	if(pw_value != null) {
        		System.out.println("페스워드는>>>");
        		
        		String passwordInput = scan.next();
        		if(pw_value.equals(passwordInput) ) {
        			System.out.println("인증성공! 일치가 일치합니다");
        			
        	    
        			
        		}else {
        			System.out.println("인증 실패! 암호가일치 하지 않습니다.");
        		}}
        		else {
        			System.out.println("등록되지 않은 ID입니다.");
        		}
        	}
        	
        }
	}
	
	
	
	


