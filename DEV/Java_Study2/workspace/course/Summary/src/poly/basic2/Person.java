package poly.basic2;

public class Person {

	 int age;
	 String name;
	 
	 Person(String name,int age){
		 this.name=name;
		 this.age=age;
		 
		 System.out.println("여기를 실행했어요");
	 }
		 
	 
	 Person(String name){
		this(name,1);
	 }
	 
//	 Person(){
//		 this("이름없음",1);
//	 }
	 
	String info() {
		 
		 return "이름:" +name + " ,나이:"+age;
	 }
}
