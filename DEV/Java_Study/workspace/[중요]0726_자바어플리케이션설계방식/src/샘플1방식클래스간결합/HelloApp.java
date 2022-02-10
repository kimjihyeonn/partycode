package 샘플1방식클래스간결합;

/*
 * 강한결합의 의미 : 양쪽을 다 작성해야함
 * 
 *
 *  소프트웨어 공학
 *  구조적 설계 => 평가방식 => 결합도 낮을수록 좋고
 *  응집도 높을 수록 좋다.
 */

public class HelloApp {

	public static void main(String[] args) {
		//객체 생성
		MessageBean bean = new MessageBean();
		//bean.sayHello("Son heung min");
		
		
		
		bean.sayHello("손흥민");
		

	}

}
