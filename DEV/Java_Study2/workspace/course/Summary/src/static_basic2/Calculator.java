package static_basic2;

public class Calculator {
	
	/*
	 * ��ü���� �ٸ����� ���´ٸ� �Ϲ� ������ �˴ϴ�.
	 * �ݴ�� ���� ���� pi�� �����ϱ� ������ static���� �������� �����ϴ�.
	 * 
	 */
	private String color;
	private int result;
	static double pi = 3.14;
	
	//�Ϲݺ����� �����ؾ� �Ѵٸ� �Ϲ� �޼��尡 �˴ϴ�.
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
	
  //�Ϲݹ����� �����ʰ� ���뼺 �ְ� ����� �޼���� static�� �˴ϴ�.
	
	public static double circle(int r) {
		return r*r*pi;
	}
	
	public static int rect(int side) {
		return side*side;
	}
}
