package inherit.basic;

public class Teacher extends Person {
	
	String subject;

	
	@Override
	String info() {
		
		return "�̸�:" +name + " ,����:"+age+" ,����:"+subject;
	}
}
