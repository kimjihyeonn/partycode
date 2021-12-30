package iaccess.di.entity;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	

	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return (this.age - arg0.getAge())*1;
	}


	

}
