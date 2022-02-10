
public class VariableEx01 {

	public static void main(String[] args) {
		int v1=15;
		if(v1>10) {
			//지역변수
			int v2 =v1-10;
		}
		//변수는 선언된 블록내에서만 사용이 가능하다.
		
		int v3 = v1  + 5;
		System.out.println(v3);

	}

}
