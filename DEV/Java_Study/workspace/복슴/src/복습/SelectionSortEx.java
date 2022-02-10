package º¹½À;

public class SelectionSortEx {

	public static void main(String[] args) {
		int[] data= {30,10,20,50,40};
		int i,j;
		int temp;
		
		for(i=0;i<data.length-1;i++) {
			for(j=i+1;j<data.length;j++) {
				
			if(data[i]>data[j]) {
				temp = data[i];
				data[i] = data[j];
				data[j]= temp;}
				
			}
		}
		int k;
        for(k=0;k<data.length;k++) {
        	System.out.println(data[k]+" ");
        }
	}

}
