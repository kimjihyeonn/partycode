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

		//���� �̿��Ͽ� �޴��� �����ϴ� ���α׷�,
		// key : �޴��̸�  value: ����
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----���� �޴� ����------");
			System.out.println("1. �ű� �޴� ���"); //�̹� ��ϵ� �޴����� Ȯ�� �Ŀ� �޴� ���
			System.out.println("2. �޴��� ��ü ����"); //�޴��� ������ ���� ���
			System.out.println("3. �޴��� ����"); //������ �޴��� �޾Ƽ� �޴��� �ִٸ� ������ ����
			System.out.println("4. �޴��� ����"); //������ �޴��� �޾Ƽ� �޴��� �ִٸ� ����
			System.out.println("5. ���α׷� ����"); //����

			System.out.print("�޴��Է�>");
			int menu = scan.nextInt();

			if(menu == 1) {
				System.out.println("����� �޴��� �Է����ּ���");
				String newMenu = scan.next();
				int newPrice = scan.nextInt();
				if(map.containsKey(newMenu)) {
					System.out.println("�޴��� �̹� �����մϴ�.");
				}
				else {
					map.put(newMenu, newPrice);
				}
				

			} else if(menu == 2) { //�޴��� ��ü ����
				
				System.out.println(map.toString());
				
				
				
			} else if(menu == 3) {// �޴��� ����
				System.out.println("������ �޴��� �Է����ּ���");
				String updateMenu = scan.next();
				if(map.containsKey(updateMenu)) {
					int updatePrice = scan.nextInt();
					map.put(updateMenu,updatePrice);
				}else {
					return;
				}

				
			} else if(menu == 4) { //����
				System.out.println("������ �޴��� �Է����ּ���");
				String deleteMenu = scan.next();
				if(map.containsKey(deleteMenu)) {
					map.remove(deleteMenu);
				}else {
					return;
				}
			

			} else if(menu == 5) {
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
				
			}

		}


	}
}
