package poly.basic2;

public class Student extends Person{
	
	String studentId;
	
	Student(String name,int age, String studentId){
		
		super(name,age);
	  
	  this.studentId = studentId;
	  
	}
	
	

	
	@Override
	String info() {
		
		return super.info()+" ,ÇÐ¹ø:"+studentId;
	}
}
