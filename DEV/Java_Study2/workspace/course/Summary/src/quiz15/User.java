package quiz15;

public class User {
     private String name;
     private int rrn;
     private int age;
     
     
     public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", rrn=" + rrn + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRrn() {
		return rrn;
	}


	public void setRrn(int rrn) {
		this.rrn = rrn;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
     
     

     
     
}
