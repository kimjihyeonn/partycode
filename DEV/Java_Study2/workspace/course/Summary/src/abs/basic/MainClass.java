package abs.basic;

public class MainClass {

	public static void main(String[] args) {

        //오버라이딩을 잘못해버리면 잘못된 메서드의 실행으로 이어진다.
		Store s = new Store();
		s.melon();
		s.orange();
		s.peach();
		
	}

}
