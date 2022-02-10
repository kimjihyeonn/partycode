package 남자회원_평균나이_구하기;
/*
 * 회원(Member) 클래스 설계
 *  '속성' 발견=> 이름, 성별, 나이
 */

public class Member {
	
	//성별에 대한 상수선언
	
	
	public static final int MALE=0;
	public static final int FEMALE=1;
	
	//멤버변수
	private String name;
	private int gender;
	private int age;
	
	
	  //생성자
	  public  Member(String name,int gender,int age) {
		  this.name=name;
				  this.gender=gender;
				  this.age=age;
	  }


	public String getName() {
		return name;
	}


	public int getGender() {
		return gender;
	}


	public int getAge() {
		return age;
	}


	
	  
 
}
