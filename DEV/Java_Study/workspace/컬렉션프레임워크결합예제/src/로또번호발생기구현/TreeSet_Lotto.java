package �ζǹ�ȣ�߻��ⱸ��;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
		
		
		/***
		 * 
		 * TreeSet ��ü�� ������ �� �̹� �����ϱ� ������ ���� ������ �ʿ䰡 ����.
		 * [����] ���� �˻�Ʈ�� �˰����� ���·� �����͸� �����Ѵ�. => �̷���Ŀ���� ���ؼ�..
		 * @param args
		 */

public class TreeSet_Lotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size()<6;i++) {
			Random rnd = new Random();
			int number = rnd.nextInt(45)+1;
			set.add(new Integer(number));
		}
		System.out.println("<<<����� �ζǹ�ȣ �����>>>");
		System.out.println(set);

	}

}
