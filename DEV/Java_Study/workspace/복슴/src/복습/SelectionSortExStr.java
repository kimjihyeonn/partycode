package ����;

import java.util.Vector;

public class SelectionSortExStr {

	public static void main(String[] args) {
		String[] arr = {"ȫ����","������","���ϳ�","������","�����"};
		
		Vector<String> vec = new Vector<String>(4, 3);
		
		String temp;
		int i,j,k;
		
		for(i=0;i<arr.length-1;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	  for(k=0;k<arr.length;k++) {
		  vec.add(arr[k]);
        
      }
	  System.out.println(vec);
	}
}

