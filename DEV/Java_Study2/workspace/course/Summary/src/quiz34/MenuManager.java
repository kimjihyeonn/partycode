package quiz34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MenuManager {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하여 메뉴를 저장하는 프로그램,
		// key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {
				System.out.println("등록할 메뉴를 입력해주세요");
				String newMenu = scan.next();
				int newPrice = scan.nextInt();
				if(map.containsKey(newMenu)) {
					System.out.println("메뉴가 이미 존재합니다.");
				}
				else {
					map.put(newMenu, newPrice);
				}
				

			} else if(menu == 2) { //메뉴판 전체 보기
				
				System.out.println(map.toString());
				
				
				
			} else if(menu == 3) {// 메뉴판 수정
				System.out.println("수정할 메뉴를 입력해주세요");
				String updateMenu = scan.next();
				if(map.containsKey(updateMenu)) {
					int updatePrice = scan.nextInt();
					map.put(updateMenu,updatePrice);
				}else {
					return;
				}

				
			} else if(menu == 4) { //삭제
				System.out.println("삭제할 메뉴를 입력해주세요");
				String deleteMenu = scan.next();
				if(map.containsKey(deleteMenu)) {
					map.remove(deleteMenu);
				}else {
					return;
				}
			

			} else if(menu == 5) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				
			}

		}


	}
}
