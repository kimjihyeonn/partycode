package ����;

import java.util.Scanner;

public class BinarySearchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 ���� �����Ͱ� ũ������� �Ǿ��־�� �����ϴ�.
		int[] data= {30,50,80,100,110,250,300,500};
		int low = 0;
		int high = data.length-1;
		int mid, find;
		//�Է�
		System.out.println("ã�����ϴ� ����?");
		Scanner scan = new Scanner(System.in);
		find = scan.nextInt();
		
		//ó��
		
		while(low<=high) {
			mid = (low+high)/2;//
			if(find == data[mid]) {
				System.out.println("ã�����ϴ� ����"+data[mid]+"�̴�");
				return;
			}
			if(find>data[mid]) {
				low= mid+1;
			}
			else {
				high=mid-1;
			}
		}
			
		System.out.println(find+"�� �������� �ʽ��ϴ�.");
		
	}

}
