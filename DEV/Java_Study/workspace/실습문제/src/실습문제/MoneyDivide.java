package 실습문제;

import java.util.Scanner;
import java.util.Vector;


public class MoneyDivide {

	public static void main(String[] args) {
		
		System.out.println("돈을입력하세요>>>");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		int won50000=0,won5000=0,won1000=0,won500=0,won100=0,won50=0,won10=0;
		
		while(money!=0) {
			if(money>=50000) {
				won50000 +=1;
				money=money-50000;
						
			}
			else if(money>=5000) {
				won5000 +=1;
				money=money-5000;
						
			}
			else if(money>=1000) {
				won1000 +=1;
				money=money-1000;
						
			}
			else if(money>=500) {
				won500 +=1;
				money=money-500;
						
			}
			else if(money>=100) {
				won100 +=1;
				money=money-100;
						
			}
			else if(money>=50) {
				won50 +=1;
				money=money-50;
						
			}
			else if(money>=10) {
				won10 +=1;
				money=money-10;
						
			}
			else {
				money=0;
			}
			
			
		}
			
		if(won50000>0)
			System.out.println("오만원권"+won50000+"매");
		if(won5000>0)
			System.out.println("오천원권"+won5000+"매");
		if(won1000>0)
			System.out.println("천원권"+won1000+"매");
		if(won500>0)
			System.out.println("오백원"+won500+"매");
		if(won100>0)
			System.out.println("100원"+won100+"매");
		if(won50>0)
			System.out.println("50원"+won50+"매");
		if(won10>0)
			System.out.println("10원"+won10+"매");

	}

}
