package List계열_클래스;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//객체생성 => 기본10개의 가변 배열 확보
		//Integer 클래스는 정수를 "객체화"시키는 클래스이다.
		//즉 10 => "10"
		ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(new Integer(90));
         list.add(new Integer(85));
         list.add(new Integer(100));
         list.add(new Integer(70));
         list.add(new Integer(95));
         
         System.out.println(list);
         
         list.add(new Integer(80));
         System.out.println(list);
         
         list.add(2,120);
         
         System.out.println(list);
         
         list.set(1, 150);
         System.out.println(list);
         /*
          * 컬렉션 프레임워크(Collection Framework)이란
          * 자바 컬렉션은 객체를 수집해서 저장하는 역할을 한다.
          * Framework이란 사용방법을 미리 정해 ㄴ놓은 라이브러리를 말한다.
          */
         
	}

}
