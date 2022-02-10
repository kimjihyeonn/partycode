package this_basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person ps = new Person("홍길동",20);
		
		Person ps2 = new Person("이순신");
		
		
		Teacher te = new Teacher("김지현",25,"사탐");
		//Person ps3 =  new Person();
		
		Student s = new Student("박찬호",20,"123123");
		//ps3.
//
//접근제어자                        사용할수있는메소드  : 반환타입      어느클래스의 메소드인지
//  초록원             equals(Object obj) :boolean   Object
		System.out.println(ps.info());
		System.out.println(ps2.info());
		//System.out.println(ps3.info());
		
		System.out.println(te.info());
		System.out.println(s.info());
	}

}
