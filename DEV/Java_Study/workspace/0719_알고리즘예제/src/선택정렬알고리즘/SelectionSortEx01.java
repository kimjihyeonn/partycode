package 선택정렬알고리즘;
/*
 * 숫자정렬 알고리즘
 */

public class SelectionSortEx01 {

	public static void main(String[] args) {
		
		// 1차원 배열의 초기화
		int[] data = {30,10,20,50,40}; 
		int i , j;
		int temp;
		int n = 5; // 데이터 갯수
		//선택정렬 알고리즘 적용
		for(i=0; i<n-1;i++) {
		
			
			for(j=i+1;j<n;j++) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i]= data[j];
					data[j] = temp;					
				}
				
			}
		}
		
		System.out.println("오름 차순 정렬");
		for(int k=0; k<n; k++) {
			System.out.println(data[k]+ " ");
		}
		
	}

}
