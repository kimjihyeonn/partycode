package inherit.basic;

public class Student extends Person{
	
	String studentId;
	
	

	
	@Override
	String info() {
		
		return "�̸�:" +name + " ,����:"+age+" ,�й�:"+studentId;
	}
}
