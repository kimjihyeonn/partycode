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
		   System.out.println(i+1+"��° ");
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


