package ����;

import java.util.Scanner;

public class SequencialEx01 {

	public static void main(String[] args) {
		//�迭=> �ڷᱸ�� �غ�
				int[] data = {30,10,50,40,20,70,90,25};
				int n = 8; // �˻� ��� ������ ����
				int i, find;
				
				
				//�Է�
				System.out.println("ã���� �ϴ� ����?");
				Scanner scan =new Scanner(System.in);
				find = scan.nextInt();
				
				//ó��=> ���� �˻� �˰� ����
				for(i=0; i<n; i++) {
					if(find == data[i]) {
						System.out.println("ã���� �ϴ� ���� "+data[i]+"�Դϴ�.");
					      break;
					}
				}
				if(i == data.length) {
					System.out.println( find+"�� ã�� �� �����ϴ�.");
				}
				//���µ����͸� �䱸 ���� ��
				

	}

}
