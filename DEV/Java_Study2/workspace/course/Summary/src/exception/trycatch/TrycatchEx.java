package exception.trycatch;

public class TrycatchEx {
	
	public static void main(String[] args) {
		//run탭 => run configuration-> argument탭;
		
		try {
			//${string_prompt}  10 20
//			System.out.println(args[0]);
//			System.out.println(args[1]);
			
			String data1 = args[0];
			String data2 = args[1];
			
			int n1=Integer.parseInt(data1);
			int n2=Integer.parseInt(data2);
			
			System.out.println("두수의 합:"+(n1+n2));
			
			
			String str =null;
			str.charAt(0);
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) { //에러의 종류(에러 클래스)
			System.out.println("인자값을 2개 전달하세요");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
			
		}catch(Exception e) {//Execption은 모든 예외를 처리합니다.
			System.out.println("기타예외입니다.");
			e.printStackTrace(); //에러의 발생된 위치를 알려주는 기능
		} finally {
			System.out.println("예외가 발생하던,발생하지않던 무조건 실행되는 문장");
		}
		
		
		System.out.println("프로그램 정상종료");
	}

}
