package ���׿����ڽǽ�;

import java.util.Scanner;

/***
 * 
 * Ű����κ��� ������ �Է¹޾� ������ ���ϴ� ���α׷�
 *
 */
public class OperatorEx02 {

	public static void main(String[] args) {
		
       System.out.print("���� �Է�>>>");
       
       
       Scanner scan = new Scanner(System.in);
       int score = scan.nextInt();
       
       String grade = score >= 90 ? "A����" :
                      score >= 80 ? "B����" :   
                      score >= 70 ? "C����" :
                      score >= 60 ? "D����" : "F����";
                      
       System.out.println("�������� ������" + grade + "�Դϴ�.");  
       
       
	}

}
