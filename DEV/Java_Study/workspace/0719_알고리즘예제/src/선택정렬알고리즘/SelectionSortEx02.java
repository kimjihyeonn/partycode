package �������ľ˰���;

/*
 * ���ڿ� ����
 */

public class SelectionSortEx02 {

	public static void main(String[] args) {
		
		//�غ� �ܰ�=> �迭 ����, ���� ���� �� �ʱ�ȭ
	   String[] name = {"����ȣ","���ǽ�","����ö","������"};
	   int i, j;
	   String temp;
	   int n = 4;//������ ����
	   
	   //ó�� �ܰ�=> �������� �˰��� ����
	   for(i=0; i<n-1; i++) {
		 
		   for(j=i+1; j<n; j++) {
			   if(name[i].compareTo(name[j])>0) {
				   temp=name[i];
				   name[i]=name[j];
				   name[j]=temp;
				   }
				else 
				 
					{System.out.println(name[i]+"��"+name[j]+"���� ����� �����Ƿ� �ƹ��ϵ� �Ͼ�� �ʽ��ϴ�.");}
				
				
				
			    
		     
		    }
			  
		   }
	   
	   
	   
	       System.out.println("-----------");
		   System.out.println("����������");
		   for (int k=0;k<n;k++) {
			 
          	 System.out.print(name[k]+" ");
	   }
           
	}

}


