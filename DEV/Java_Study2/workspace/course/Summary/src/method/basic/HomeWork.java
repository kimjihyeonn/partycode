package method.basic;

import java.util.Arrays;

public class HomeWork {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println(method2("¹Ùº¸"));
		System.out.println(method3(4,5,3.44));
		
		System.out.println(method4(6));
		
		method5("°¡",6);
		
		System.out.println(abs(-8));
		
		System.out.println(maxNum(7, 10));
		
           
           char[] arr = {'°¡','³ª','´Ù'};
           
          String b= method6(arr);
           
         System.out.println(b);
         
         int[] numarray = {5,6,7,8,9};
         
         System.out.println(method7(numarray));
         
         String[] arr2 = method8("°¡","³ª");
         System.out.println(Arrays.toString(arr2));
         
         String str= java(8);
         System.out.println(str);
	}

	//1.
	static void method1() {
		System.out.println("¾È³ç");
	}
	//2.
	
	static String method2(String a) {
		
		return  a;
	}
	
	//3.
	static double method3(int a,int b, double c){
		
		return (a+b+c);
		
	}
	//4.
	static String method4(int a) {
		String b= null;
		if(a%2 == 1) {
			b="È¦¼ö";
		}
		else {
			b="Â¦¼ö";
		}
		return b;
	}
	//5.
	static void method5(String a, int b) {
		
		for(int i=0;i<=b;i++) {
			System.out.println(a);
		}
		
	}
	//6.
	static int maxNum(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	//7.
	static int abs(int a) {
		
		int superNum=0;
		if(a<0) {
			superNum=a*(-1);
			
		}
		else {
			superNum=a;
		}
		return superNum;
	}
	//8.
	static String method6(char[] a) {
		
		String b="";
		
		for(int i =0;i<a.length;i++) {
			
			b += a[i];
		}
		return b;
		
		
		
	}
	//9.
	static int method7(int[] a) {
		
		int sum=0;
		for(int i=0; i<a.length;i++) {
			
			sum += a[i];
		}
		return sum;
	}
	//10.
	static String[] method8(String a,String b) {
		
		String[] arr = new String[2];
		
		arr[0]= a;
		arr[1]= b;
		
		return arr;
		
		
		
		
	}
	//11.
	static String java(int a) {
		String str="";
		
		for(int i=0; i<=a;i++) {
			if(i%2==0) {
				str +="ÀÚ";
			}
			else {
				str +="¹Ù";
			}
		}
		
		return str;
	
	}
}
