package overloading.basic;

public class Mainclass2 {

	public static void main(String[] args) {
		// °úÁ¦
		//
		
		Computer com = new Computer();
		
	    double a=com.rect(8.44);
	    double b=com.circle(4);
	    double c=com.rect(4);
		double d=com.rect(5.55,4.33);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
