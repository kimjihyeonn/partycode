package ����_����_�ý���_���;

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
		
        System.out.print("���� ������ �Է��ϼ���>>>");
        Scanner scan = new Scanner(System.in);
        String payments_means=scan.next();
        
        PayGroup pay =PayGroup.findByPayCode(payments_means);
        System.out.println("��������:"+pay.getTitle()+" ����ó��");
        
	}
    
}
