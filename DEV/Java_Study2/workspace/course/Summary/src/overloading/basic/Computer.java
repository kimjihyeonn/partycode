package overloading.basic;

public class Computer extends Calculator {
  
	@Override
	double circle(int b) {
		
		
		
		
		double cirarea= (b/2)*(b/2)*Math.PI;
		
		return cirarea;
	}
	
	double rect(double c) {
		double rectarea=c*c;
		return rectarea;
	}
	double rect(double a,double b) {
		double rectarea=a*b;
		return rectarea;
	}
}
