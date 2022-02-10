package 람다식_기초예제;



public class MyFunctionInterfaceEx   {

	public static void main(String[] args) {
		
		
		 MyFunctionInterface fi;
		 
		 /*[리턴값x,매개변수x]
		 fi =()-> {String str = "메소드 호출1";
		     System.out.println(str);
		     
		 
		 
		 };
		fi.method();
		
		fi = () ->{System.out.println("메소드 호출");};
		 
		fi.method();
		
		
		fi = () ->System.out.println("메소드 호출");
		 
		fi.method();*/
		
		 /*
		  * fi=(x) ->{
			int result= x*5;
			System.out.println(result);
		 };
		 fi.method(2);
	}*/
		 
		 fi=(x,y)->{
			 int result=x+y;
			 return result;
			 
		 };

	   System.out.println(fi.method(2, 5)); 
	}

}
