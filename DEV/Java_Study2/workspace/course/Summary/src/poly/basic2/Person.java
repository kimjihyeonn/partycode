package poly.basic2;

public class Person {

	 int age;
	 String name;
	 
	 Person(String name,int age){
		 this.name=name;
		 this.age=age;
		 
		 System.out.println("���⸦ �����߾��");
	 }
		 
	 
	 Person(String name){
		this(name,1);
	 }
	 
//	 Person(){
//		 this("�̸�����",1);
//	 }
	 
	String info() {
		 
		 return "�̸�:" +name + " ,����:"+age;
	 }
}
