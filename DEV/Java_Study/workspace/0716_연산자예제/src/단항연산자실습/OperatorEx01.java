package 단항연산자실습;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int a =10;
		int result = ++a; //a++
		int result2 = a + 1;
		System.out.println(result);
		System.out.println(result2);
		
		//연산자의 우선순위가 동일할 떄는 왼쪽에서 오른쪽으로 연산
		int cal =100*2/3%5;
		System.out.println(cal);
		//
		int x,y,z;
		x=y=z=5;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
