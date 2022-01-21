package prac;

import java.util.Optional;
import java.util.stream.Stream;

public class Optional1 {

	public static void main(String[] args) {
		int[] arr = new int[0];
		 System.out.println(arr.length);
		 
		 //Optional<String> opt = null;
		 
		Optional<String> opt = Optional.empty();
	  System.out.println(opt);
	  //System.out.println(opt.get());
   String str = "";
//	  
//	  try {
//		 str = opt.get();
//	} catch (Exception e) {
//		
//	}
//	}
//
    str =  opt.orElse("EMPTY");
    System.out.println(str);
    String s = "hi";
     str = opt.orElseGet(String::new);
     System.out.println(str);
    
     String[] strArr = {
    		 "1" , "2","3","4","5"
     };
     Stream.of(strArr)
     .parallel()
     .forEach(System.out::println);
     
     
 }
}
