package static_basic2;

public class Calculator {
	
	/*
	 * 객체마다 다른값을 갖는다면 일반 변수가 됩니다.
	 * 반대로 계산기 마다 pi는 동일하기 때문에 static으로 쓰는편이 좋습니다.
	 * 
	 */
	private String color;
	private int result;
	static double pi = 3.14;
	
	//일반변수를 참조해야 한다면 일반 메서드가 됩니다.
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
  //일반범수를 쓰지않고 범용성 있게 사용할 메서드는 static이 됩니다.
	
	public static double circle(int r) {
		return r*r*pi;
	}
	
	public static int rect(int side) {
		return side*side;
	}
}
