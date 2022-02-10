package inherit.basic;

public class Teacher extends Person {
	
	String subject;

	
	@Override
	String info() {
		
		return "이름:" +name + " ,나이:"+age+" ,과목:"+subject;
	}
}
