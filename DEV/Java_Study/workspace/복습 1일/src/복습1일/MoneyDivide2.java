package 복습1일;

import java.util.Scanner;

public class MoneyDivide2 {

	public static void main(String[] args) {
		System.out.println("금액을 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		int money =scan.nextInt();
		
		int won50000=0,won5000=0;
		
		while(money!=0) {
			if(money>=50000) {
				won50000+=1;
				money=money-50000;
						
			}
			else if(money>=5000) {
				won5000+=1;
				money=money-5000;
				
				
			}
			else {
				money= 0;
		}
		
		
	

	}
	if(won50000>0) 
		System.out.println("오만원권"+won50000+"매");
    if(won5000>0)
      System.out.println("오천원권"+won5000+"매");	
		
	}
}
