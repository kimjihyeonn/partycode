package 정렬;

import java.util.Scanner;

public class SequencialEx01 {

	public static void main(String[] args) {
		//배열=> 자료구조 준비
				int[] data = {30,10,50,40,20,70,90,25};
				int n = 8; // 검색 대상 데이터 갯수
				int i, find;
				
				
				//입력
				System.out.println("찾고자 하는 값은?");
				Scanner scan =new Scanner(System.in);
				find = scan.nextInt();
				
				//처리=> 순차 검색 알고 리즘
				for(i=0; i<n; i++) {
					if(find == data[i]) {
						System.out.println("찾고자 하는 값은 "+data[i]+"입니다.");
					      break;
					}
				}
				if(i == data.length) {
					System.out.println( find+"을 찾을 수 없습니다.");
				}
				//없는데이터를 요구 했을 떄
				

	}

}
