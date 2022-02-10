package Search;

import java.util.Scanner;

/**
 * 
 * [중요] 검색(search)알고리즘
 * 1.순차(sequential)검색 알고리즘
 * 2.이분(binary)검색 알고리즘
 * 
 * 순차검색
 * 장점 
 * 1.데이터가 정렬(x)
 * 2.프로그램구현(logic)쉽다
 * 단점
 * 1.평균검색 횟수
 * n+1/2
 * (n:데이터개수)
 * 
 * 이분검색
 * 장점
 * 1.평균검색 횟수= log2n
 * 2.최대 비교횟수 =(log2n)+1
 * 단점
 * 1.데이터가 반드시정렬(o)
 * 2.순차검색보다 프로그램 구현이 좀더 복잡하다.
 *
 */

/*
 * 순차검색 알고리즘
 */

public class SequentailEx01 {

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
