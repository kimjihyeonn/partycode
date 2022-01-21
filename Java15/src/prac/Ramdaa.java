package prac;

import java.util.function.Function;

public class Ramdaa {

	public static void main(String[] args) {
    Function<String,Integer> f=Integer::parseInt;
    
    System.out.println(f.apply("100")+100);
	}

}
