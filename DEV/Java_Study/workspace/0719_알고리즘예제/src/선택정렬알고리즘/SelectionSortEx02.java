package 선택정렬알고리즘;

/*
 * 문자열 정렬
 */

public class SelectionSortEx02 {

	public static void main(String[] args) {
		
		//준비 단계=> 배열 선언, 변수 선언 및 초기화
	   String[] name = {"박태호","김의실","오수철","손유일"};
	   int i, j;
	   String temp;
	   int n = 4;//데이터 갯수
	   
	   //처리 단계=> 선택정렬 알고리즘 적용
	   for(i=0; i<n-1; i++) {
		 
		   for(j=i+1; j<n; j++) {
			   if(name[i].compareTo(name[j])>0) {
				   temp=name[i];
				   name[i]=name[j];
				   name[j]=temp;
				   }
				else 
				 
					{System.out.println(name[i]+"가"+name[j]+"보다 어순이 작으므로 아무일도 일어나지 않습니다.");}
				
				
				
			    
		     
		    }
			  
		   }
	   
	   
	   
	       System.out.println("-----------");
		   System.out.println("최종정렬은");
		   for (int k=0;k<n;k++) {
			 
          	 System.out.print(name[k]+" ");
	   }
           
	}

}


