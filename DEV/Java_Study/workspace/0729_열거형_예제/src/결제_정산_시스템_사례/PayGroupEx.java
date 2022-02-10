package 결제_정산_시스템_사례;

import java.util.Scanner;

public class PayGroupEx {

	public static void main(String[] args) {
		for(PayGroup type : PayGroup.values()){
			System.out.println(type.getTitle());
		}
		System.out.println();
		
		for(PayGroup type : PayGroup.values()){
			System.out.println(type.getPayList());
		}
		System.out.println();
		
        System.out.print("결제 수단을 입력하세요>>>");
        Scanner scan = new Scanner(System.in);
        String payments_means=scan.next();
        
        PayGroup pay =PayGroup.findByPayCode(payments_means);
        System.out.println("결제종류:"+pay.getTitle()+" 결제처리");
        
	}
    
}
