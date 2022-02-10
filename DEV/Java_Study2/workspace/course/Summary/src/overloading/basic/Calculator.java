package overloading.basic;

public class Calculator {

	 int result;
	 double pi;
	 
	 
	 int add(int a){
		 return result += a;
	 }
	 
	 
	 double circle(int b) {
		 
		 double pi = 3.14;
		 
		 double cirarea= (b/2)*(b/2)*pi;
		 
		 return cirarea;
	 }
}

