package this_basic;

public class Teacher extends Person {
	
	String subject;
	
	
	Teacher(String name, int age, String subject){
		super(name,age);
		this.subject = subject;
		
	}

	
	@Override
	String info() {
		
		return "�̸�:" +name + " ,����:"+age+" ,����:"+subject;
	}
}
