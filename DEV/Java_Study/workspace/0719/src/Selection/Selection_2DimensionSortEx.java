package Selection;
/*
 * [�߿�] 2���� �迭 ���� �˰��� ����
 */

public class Selection_2DimensionSortEx {

	public static void main(String[] args) {
		//�غ�ܰ�=>2���� �迭�� �ʱ�ȭ�� 1��, 1���� �ʱ�ȭ�Ѵ�. 
		//[����] �޸𸮰� 1���� ������ �Ǿ��ֱ� ������ 
		String[][] str= {{"1","����ȣ","����","���α׷���"},
				         {"2","�輱��","��õ","ȸ���"},
				         {"3","����ö","�д�","������"},
				         {"4","������","����","����"}
		};
      int i,j, m,k,s; // for���� �����
      String temp;
      int n = 4; //4���� ������
     
      //ó���ܰ�=> �������� �˰��� ����=> [����] "�̸�"������ ���� ��Ű��
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
      //��´ܰ�
     for(m=0;m<str.length;m++) {
    	 for(s=0;s<str.length;s++) {
    		 System.out.print(str[m][s]+" ");
    		 
    	 }
    	 System.out.println();
     }
      
	}
	
	

}
