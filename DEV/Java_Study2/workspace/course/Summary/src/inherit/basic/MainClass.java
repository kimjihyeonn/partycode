package inherit.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		
		
		s.age=20;
		s.name="ȫ�浿";
		s.studentId="200202";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		
		
		t.age =30;
		t.name = "�̼���";
		t.subject = "ȸ��";
		System.out.println(t.info());

	}

}
