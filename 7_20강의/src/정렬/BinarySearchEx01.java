package 정렬;

import java.util.Scanner;

public class BinarySearchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 안의 데이터가 크기순으로 되어있어야 가능하다.
		int[] data= {30,50,80,100,110,250,300,500};
		int low = 0;
		int high = data.length-1;
		int mid, find;
		//입력
		System.out.println("찾고자하는 값은?");
		Scanner scan = new Scanner(System.in);
		find = scan.nextInt();
		
		//처리
		
		while(low<=high) {
			mid = (low+high)/2;//
			if(find == data[mid]) {
				System.out.println("찾고자하는 값은"+data[mid]+"이다");
				return;
			}
			if(find>data[mid]) {
				low= mid+1;
			}
			else {
				high=mid-1;
			}
		}
			
		System.out.println(find+"은 존재하지 않습니다.");
		
	}

}
