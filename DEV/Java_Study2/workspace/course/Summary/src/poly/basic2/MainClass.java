package poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
	//  �������� ���ٸ�?
//		Student s1 = new Student("ȫ�浿", 20, "123");
//		Student s2 = new Student("�̼���",30,"124");
//		
//		Teacher t1 = new Teacher("ȫ����",40,"�İ�");
//		Teacher t2 = new Teacher("ȫ���",50,"���");
//		Teacher t3 = new Teacher("�Ż��Ӵ�",60,"����");
////		
//		Student[] sArr = {s1,s2};
//		Teacher[] tArr = {t1,t2,t3};
//		
		
		Person s1 = new Student("ȫ�浿", 20, "123");
		Person s2 = new Student("�̼���",30,"124");
		
		Person t1 = new Teacher("ȫ����",40,"�İ�");
		Person t2 = new Teacher("ȫ���",50,"���");
		Person t3 = new Teacher("�Ż��Ӵ�",60,"����");
		
		Person[] pArr = {s1,s2,t1,t2,t3};
		
		for(Person p: pArr) {
			System.out.println(p.info());
			
		}
		System.out.println("-----------------------------");
		
		printInfo(s1);
		
		
	}//end main
	
	
	public static void printInfo(Person p) {
		System.out.println(p.info());
	}
	
	public static void method(Object o) {
		
	}

}
