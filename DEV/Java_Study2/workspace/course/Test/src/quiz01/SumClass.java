package quiz01;

import java.util.Scanner;

public class SumClass {
	public int sum() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�������Է��ϼ���:");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num;i++) {
			
			sum +=i;
		}
		System.out.println(sum);
		return sum;
		
	}

	public static void main(String[] args) {


		SumClass sum = new SumClass();
		
		int i= sum.sum();
		
		

	}

}
