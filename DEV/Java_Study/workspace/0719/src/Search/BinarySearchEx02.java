package Search;

import java.util.Scanner;

/*
 * 이분 검색 알고리즘
 */
public class BinarySearchEx02 {

	public static void main(String[] args) {
		String[] name = {"김선동","마동석","박태호","손유일","오수철","최연호"};
		int low=0;
		int high=name.length-1;
		int mid;
		String find;
		
		System.out.println("찾고자하는 이름은? ");
		Scanner scan = new Scanner(System.in);
		find = scan.next();
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(find.equals(name[mid])) {
				System.out.println("찾고자하는이름은"+name[mid]+"이다.");
				return;
			}
			if(find.compareTo(name[mid])>0) {
				low = mid+1;
			}
			else {
				high=mid-1;
					
				
			}
		}
      System.out.println("찾고자하는 이름이 존재하지 않습니다.");
	}

}
