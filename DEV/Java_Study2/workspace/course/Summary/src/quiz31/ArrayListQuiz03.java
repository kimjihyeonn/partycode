package quiz31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {
		
		//User��ü�� �̿��ؼ� ȸ������ ���α׷��� �ۼ��Ϸ� �մϴ�.
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		
		while(true) {
			
			System.out.println("[1.��� | 2.ȸ���������� |3.ȸ�������˻� | 4.ȸ���������� | 5.����");
			System.out.print("�޴��� �Է�>");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				//��ĳ�ʷ� �̸�, ���̸� �Է¹ް� User�� ����, ����Ʈ�� �߰�
				System.out.print("�̸��� �Է��ϼ���.");
				String userName =scan.next();
				System.out.print("���̸� �Է��ϼ���.");
				int userAge =scan.nextInt();
			    
				
				
				
				list.add(new User(userName,userAge));
				
		
				
			} else if(menu == 2) {
				//list�� ���̸�ŭ ȸ���ϸ鼭 User��ü�� �̸�, ���̸� ������� ���
				
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i));
					
				}
				
				
			} else if(menu == 3) {
				//ã�� �̸��� �Է¹޽��ϴ�. �̸��� �ִٸ�, �̸��� ���̸� ����մϴ�.
				//ã�� �̸� ���ٸ� "~~���� ��Ͽ� �����ϴ�" �� ����մϴ�.
				System.out.println("ã�� �̸��� �Է��մϴ�.");
				String userName = scan.next();
				for(int i=0; i<list.size();i++) {
					User u = list.get(i);
					String uName = u.getName();
					
					if(uName.equals(userName)) {
						System.out.println(list.get(i));
					}
					else {
						System.out.println(userName+"���� ��Ͽ� �����ϴ�.");
					}

				}
				
				
				
			} else if(menu == 4) {
				//������ �̸��� �Է¹޽��ϴ�. �Է¹��� �̸��� �����ϴٸ� User��ü�� ����.
				System.out.println("������ �̸��� �Է��մϴ�.");
				String userName = scan.next();
				for(int i=0; i<list.size();i++) {
					User u = list.get(i);
					String uName = u.getName();
					if(uName.equals(userName)) {
						list.remove(i);
					}
					else {
						return;
					}
					
				}
				
				
			} else if(menu == 5) {
				
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
				
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
			
			
		}
		
		
		
		
	}
}
