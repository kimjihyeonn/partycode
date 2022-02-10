
public class CharEx {

	public static void main(String[] args) {
	   char c1 = 'A';// c1이라는 변수(그릇)에는 실제 'A' 값이 저장됨
	   char c2 = 65;
	   char c3 = '\u0041';
			   
			   System.out.println(c1);
			   System.out.println(c2);
			   System.out.println(c3);
			   
	   char c4 = '가';
	   char c5 = 44032;
	   char c6='\uac00';
	   
	   System.out.println(c4);
	   System.out.println(c5);
	   System.out.println(c6);
	   //즉 name 변수는 객체 참조변수이다.
	   String name = "안녕하세요";//문자열
	   //name이라는변수에는 객체의 주소값이 저장주소값 저장
			   
	   System.out.println(name);

	}

}
