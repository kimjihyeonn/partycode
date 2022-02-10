package Search;

import java.util.Scanner;

/*
 * �̺� �˻� �˰���
 */
public class BinarySearchEx02 {

	public static void main(String[] args) {
		String[] name = {"�輱��","������","����ȣ","������","����ö","�ֿ�ȣ"};
		int low=0;
		int high=name.length-1;
		int mid;
		String find;
		
		System.out.println("ã�����ϴ� �̸���? ");
		Scanner scan = new Scanner(System.in);
		find = scan.next();
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(find.equals(name[mid])) {
				System.out.println("ã�����ϴ��̸���"+name[mid]+"�̴�.");
				return;
			}
			if(find.compareTo(name[mid])>0) {
				low = mid+1;
			}
			else {
				high=mid-1;
					
				
			}
		}
      System.out.println("ã�����ϴ� �̸��� �������� �ʽ��ϴ�.");
	}

}
