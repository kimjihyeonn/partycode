package api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		int a = 100;
		double b= 3.14;
		char c = 'A';
		
		//boxing - 기본형->객체형으로 변경
		
		Integer i1 = new Integer(a);
		Double d1 = new Double(b);
		Character c1 = new Character(c);
		
		
		//unboxing - 객체형 -> 기본형으로 변경
		int var1 = i1.intValue();
		double var2 = d1.doubleValue();
		char var3 = c1.charValue();
		
		//autoboxing - 래퍼클래스와 기본타입간의 자동 형변환을 제공.
		int k = i1;
		
		Integer i2 = k;
		
		
		//wrapper 클래스의 대표적인 기능
		int a1=Integer.parseInt("1");
		double a2 = Double.parseDouble("31.4");
		
		long a3 = Long.parseLong("4444233");

	}

}
