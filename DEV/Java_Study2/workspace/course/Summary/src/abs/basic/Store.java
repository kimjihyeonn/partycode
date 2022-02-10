package abs.basic;

public class Store extends HeadStore {
    //프로그래머가 실수로 오버라이딩을 빼먹었다면?
	@Override
	public void melon() {
		System.out.println("서울지점의 멜론은 500원");
	}

	@Override
	public void orange() {
		System.out.println("서울지점의 오렌지는 600원");
	}
	
	//???
	
	

}
