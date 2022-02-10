package 정렬;

import java.util.Scanner;

public class SequencialEx02 {

	public static void main(String[] args) {
	String[] name = {"오수철","김선동","이강인","손흥민","박태호"};
		
		int i;
		String find;
		
		System.out.println("찾고자하는 이름은?");
		Scanner scan = new Scanner(System.in);
		find =scan.next();
		
		//순차검색 알고리즘 적용
		//charAt(),compareTo(),equals() String 객체
		for(i=0; i<name.length; i++) {
			if(find.equals(name[i])) {
				System.out.println("찾고자하는 이름은"+
			name[i]+"입니다");
				break;
				
			}
		}
		if(i==name.length) {
			System.out.println("찾고자하는 이름이 존재하지 않습니다.");
		}


	}

}
