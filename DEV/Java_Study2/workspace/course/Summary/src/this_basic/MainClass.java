package this_basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person ps = new Person("ȫ�浿",20);
		
		Person ps2 = new Person("�̼���");
		
		
		Teacher te = new Teacher("������",25,"��Ž");
		//Person ps3 =  new Person();
		
		Student s = new Student("����ȣ",20,"123123");
		//ps3.
//
//����������                        ����Ҽ��ִ¸޼ҵ�  : ��ȯŸ��      ���Ŭ������ �޼ҵ�����
//  �ʷϿ�             equals(Object obj) :boolean   Object
		System.out.println(ps.info());
		System.out.println(ps2.info());
		//System.out.println(ps3.info());
		
		System.out.println(te.info());
		System.out.println(s.info());
	}

}
