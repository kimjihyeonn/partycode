package quiz01;

import java.util.HashMap;

public class PersonClass {

	public static void main(String[] args) {
		

		HashMap<String,String> hasmap = new HashMap<String,String>();

		Person person = new Person();
		Person person2 = new Person();

		person.setName("±èÁöÇö");
		person.setAge("19");
		
		person2.setName("±èÁöÁö");
		person2.setAge("20");
		
		hasmap.put(person.getName(),person.getAge());
		hasmap.put(person2.getName(),person2.getAge());
		
		System.out.println(hasmap);
	}



}
