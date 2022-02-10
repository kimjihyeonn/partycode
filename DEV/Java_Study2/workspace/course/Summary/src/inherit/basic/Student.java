package inherit.basic;

public class Student extends Person{
	
	String studentId;
	
	

	
	@Override
	String info() {
		
		return "이름:" +name + " ,나이:"+age+" ,학번:"+studentId;
	}
}
