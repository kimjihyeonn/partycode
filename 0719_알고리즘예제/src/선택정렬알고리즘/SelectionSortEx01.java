package �������ľ˰���;
/*
 * �������� �˰���
 */

public class SelectionSortEx01 {

	public static void main(String[] args) {
		
		// 1���� �迭�� �ʱ�ȭ
		int[] data = {30,10,20,50,40}; 
		int i , j;
		int temp;
		int n = 5; // ������ ����
		//�������� �˰��� ����
		for(i=0; i<n-1;i++) {
			System.out.println(data[0]);
			System.out.println(data[1]);
			System.out.println(data[2]);
			System.out.println(data[3]);
			System.out.println(data[4]);
			System.out.println("����");
			
			for(j=i+1;j<n;j++) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i]= data[j];
					data[j] = temp;					
				}
				
			}
		}
		
		System.out.println("���� ���� ����");
		for(int k=0; k<n; k++) {
			System.out.println(data[k]+ " ");
		}
		
	}

}
