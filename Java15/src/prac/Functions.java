package prac;

import java.util.Arrays;
import java.util.function.Function;

public class Functions {
	public static void main(String[] args) {
		//Supplier<MyClass> s =  MyClass::new;
		
		/*
		 * MyClass mc = s.get(); System.out.println(mc);
		 */
		Function<Integer, MyClass> f = MyClass::new;
		
//		Function<Integer,int[]> f2 = (i) -> new int[i];
		Function<Integer,int[]> f2 = int[]::new;
		System.out.println(f2);
		 int[] arr =  f2.apply(100);
		 
		System.out.println(Arrays.toString(arr));
	}

}

class MyClass{
	int iv;
	MyClass(int iv){
		this.iv = iv;
	}
	
}
