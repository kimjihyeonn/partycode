package ���ٽ�_���ʿ���;



public class MyFunctionInterfaceEx   {

	public static void main(String[] args) {
		
		
		 MyFunctionInterface fi;
		 
		 /*[���ϰ�x,�Ű�����x]
		 fi =()-> {String str = "�޼ҵ� ȣ��1";
		     System.out.println(str);
		     
		 
		 
		 };
		fi.method();
		
		fi = () ->{System.out.println("�޼ҵ� ȣ��");};
		 
		fi.method();
		
		
		fi = () ->System.out.println("�޼ҵ� ȣ��");
		 
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
