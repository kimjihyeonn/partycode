package Selection;
/*
 * [중요] 2차원 배열 정렬 알고리즘 구현
 */

public class Selection_2DimensionSortEx {

	public static void main(String[] args) {
		//준비단계=>2차원 배열의 초기화는 1차, 1차로 초기화한다. 
		//[이유] 메모리가 1차원 구조로 되어있기 때문에 
		String[][] str= {{"1","박태호","서울","프로그래머"},
				         {"2","김선동","인천","회사원"},
				         {"3","오수철","분당","연예인"},
				         {"4","손유일","강남","교수"}
		};
      int i,j, m,k,s; // for문의 제어변수
      String temp;
      int n = 4; //4행의 데이터
     
      //처리단계=> 선택정렬 알고리즘 적용=> [조건] "이름"순으로 정렬 시키기
      for(i=0;i<str.length-1;i++) {
    	  for(j=i+1;j<str.length;j++) {
    		  if(str[i][1].compareTo(str[j][1])>0)
    		  {
    			for(k=0;k<str[0].length;k++) {
    				temp = str[i][k];
    				str[i][k] = str[j][k];
    				str[j][k] = temp;
    		
    			}
    		  }
    	  }
      }
      //출력단계
     for(m=0;m<str.length;m++) {
    	 for(s=0;s<str.length;s++) {
    		 System.out.print(str[m][s]+" ");
    		 
    	 }
    	 System.out.println();
     }
      
	}
	
	

}
