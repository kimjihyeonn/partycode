package List계열_클래스;
/*
 * Vector 클래스 => 생성한 객체=>자료구조
 */

import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		String[] arr= {"김진명","최인호","조정래","박경리","김흥신"};
		
		/*
		 * Vector 클래스 객체는 가변 배열이다.
		 */
		
		Vector<String> vec = new  Vector<String>(4, 3);
		
		System.out.println("백터에 저장된 요소의 갯수는 :" + vec.size());//0
		System.out.println("백터의 용량은 : "+vec.capacity()+"\n");//4
		
		for(int i=0; i<arr.length;i++) {
			vec.add(arr[i]);
			
		}
		System.out.println("백터에 저장된 요소의 갯수는 :" + vec.size());//0
		System.out.println("백터의 용량은 : "+vec.capacity()+"\n");//4
		
		System.out.println(vec);
          //[김진명, 최인호, 조정래, 박경리, 김흥신]
		/**
		 *[중요] 객체 지향언어의 다형성  method overloading
		 */
		vec.add("손흥민");
		System.out.println(vec);
		//[김진명, 최인호, 조정래, 박경리, 김흥신, 손흥민]
		vec.add(2, "홍길동");
		System.out.println(vec);
		//[김진명, 최인호, 홍길동, 조정래, 박경리, 김흥신, 손흥민]
		//"최인호"와"조정래" 사이에 "홍길동"추가
		
		vec.remove(1);
		System.out.println(vec);
		//[김진명, 홍길동, 조정래, 박경리, 김흥신, 손흥민]
		//"김홍신"삭제
		vec.remove("김흥신");
		System.out.println(vec);
		
	}

}
