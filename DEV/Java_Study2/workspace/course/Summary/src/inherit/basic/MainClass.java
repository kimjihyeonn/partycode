package inherit.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		
		
		s.age=20;
		s.name="홍길동";
		s.studentId="200202";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		
		
		t.age =30;
		t.name = "이순신";
		t.subject = "회계";
		System.out.println(t.info());

	}

}
