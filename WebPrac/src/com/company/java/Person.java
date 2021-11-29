package com.company.java;

public class Person {

	public static void main(String[] args) {
		
		pay();
		dia();

	}
   
	
	static void pay() {
		
		System.out.println( 1+1);
	}
	
	static void dia() {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
			System.out.print("*");
				
			}
			
			System.out.println();
		}
	    for(int i=4; i>0; i--) {
	    	for(int j=4;j>=i; j--) {
	    		System.out.print(" ");
	    	}
	    	for(int j=1; j<=2*i-1; j++) {
    		System.out.print("*");
    	}
	    	
	    	System.out.println();
	    }
	}
}
