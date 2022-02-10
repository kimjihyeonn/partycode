package poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
	//  다형서잉 없다면?
//		Student s1 = new Student("홍길동", 20, "123");
//		Student s2 = new Student("이순신",30,"124");
//		
//		Teacher t1 = new Teacher("홍길자",40,"컴공");
//		Teacher t2 = new Teacher("홍길순",50,"기공");
//		Teacher t3 = new Teacher("신사임당",60,"문예");
////		
//		Student[] sArr = {s1,s2};
//		Teacher[] tArr = {t1,t2,t3};
//		
		
		Person s1 = new Student("홍길동", 20, "123");
		Person s2 = new Student("이순신",30,"124");
		
		Person t1 = new Teacher("홍길자",40,"컴공");
		Person t2 = new Teacher("홍길순",50,"기공");
		Person t3 = new Teacher("신사임당",60,"문예");
		
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
