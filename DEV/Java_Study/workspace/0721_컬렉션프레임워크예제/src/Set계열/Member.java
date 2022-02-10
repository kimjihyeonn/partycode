package Set계열;

/**
 * 
 * 클래스의 구성 요소는 
 * 1.필드(field)
 * 2.생성자: 객체 생성, 객체의 필드를 초기화 시킨다.
 * 3.메소드: 객체의 기능,동작,행위
 */

/**
 * 
 * 자바 개발자가 클래스를 선언하면 extends 키워드로 다른클래스를 상속하지않으면
 * 암시적으로 java.lang패키지에  포함된 Object 클래스를 상속하게된다.
 * 
 * Object 클래스의 중요메소드
 * equals()
 * hashCode()
 * toString() 가 있다.
 *
 */
            //자식크래스명 extends 부모 클래스이름
public class Member{//"회원"클래스는 설계도이다.
	//필드(전역변수) 선언
	//접근제어자 타입  변수명
	private String name; // 이름  private=접근제어자
	private int age; //나이
	private String juminNum; //주민번호
	
	//생성자 만드는 규칙        지역변수ㄱ
	public Member(String name,int age,String juminNum) {
		this.name= name;
		this.age=age;
		this.juminNum = juminNum;
	
	}
	//메소드 만드는 방법

	@Override //어노테이션
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
		
		return member.name.equals(name)&& (member.age == age)
				&& member.juminNum.equals(juminNum);
	}else {
		return false;
	}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age + juminNum.hashCode();
	}
   
}
