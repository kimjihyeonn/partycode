package º¹½À;

public class prac1 {
	private String name;
	private int age;
	private String juminNum;
	
	public prac1(String name, int age,String juminNum) {
		this.name=name;
		this.age=age;
		this.juminNum = juminNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof prac1) {
			prac1 member = (prac1)obj;
			return member.name.equals(name)&&(member.age ==age)&&(member.juminNum.equals(juminNum));
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		
		return name.hashCode() + age + juminNum.hashCode();
	}
	
	
	

}
