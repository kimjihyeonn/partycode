package Selection;

public class SelectionSortEx02 {

	public static void main(String[] args) {
		//준비 단계=> 배열 선언, 변수 선언 및 초기화
		   String[] name = {"박태호","김의실","오수철","손유일"};
		   int i, j;
		   String temp;
		   int n = 4;//데이터 갯수
		   
		   //처리 단계=> 선택정렬 알고리즘 적용
		   for(i=0; i<n-1; i++) {
			   System.out.println(i+1+"번째 ");
			   System.out.print(name[0]);
			   System.out.print(name[1]);
			   System.out.print(name[2]);
			   System.out.print(name[3]);
			   System.out.println(" ");
			   for(j=i+1; j<n; j++) {
				   if(name[i].compareTo(name[j])>0) {
					   temp=name[i];
					   name[i]=name[j];
					   name[j]=temp;
					   System.out.println(name[0]);
					   System.out.println(name[1]);
					   System.out.println(name[2]);
					   System.out.println(name[3]);
					   System.out.println("-------");}
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


	


