package This;
/**
 * this와 this()차이점
 * super와 super()차이점
 * ----------------------------------------------------
 * this : 인스턴스 자신을 가리키는 참조 변수
 * this() : 생성자로 같은 클래스의 다른 생성자를 호출 시 사용
 * 
 * 
 * 
 */
//'A' 라는 대학의 학생이라고 가정
 class Person{
	//필드선언
	private int juminNum; // 주민번호
	private String militaryNum;// 군번
	private int birthYear; //출생년도
	private int birthMonth; ///출생월
	private int birthDay; //출생일
    //생성자
	public Person(int juminNum,String militaryNum,int bYear,int bMonth,int bDay) {
		
		this(41,23,43,23);
		/*this.juminNum=juminNum;
		
		this.militaryNum = militaryNum;
		birthYear=bYear;
		birthMonth =bMonth;
		birthDay=bDay;*/
		
	} 
	 


	public Person(int juminNum,int bYear,int bMonth,int bDay) {
		
//		this(juminNum,"군과관계없음",bYear,bMonth,bDay);
		/*
        this.juminNum=juminNum;
		this.militaryNum = 0;  //조건이 0이면 군과 관계없음
		birthYear=bYear;
		birthMonth =bMonth;
		birthDay=bDay;*/
	}
	//메소드 구현
	public void showInfo() {
		System.out.println("주민번호:" + juminNum );
		
		System.out.println("출생년도:" + birthYear+birthMonth+ birthDay );
		
	if(militaryNum!="군과관계없음") {
		System.out.println("군번 :" + militaryNum +"\n");
		
	
	}else {
		System.out.println("군과 관계 없음" );
	}
 }

}

 public class ThisEx {

	public static void main(String[] args) {
		
		Person man = new Person(1234123,"1171003045",1991,04,27);
		
		Person woman = new Person(1234,1943,04,28);
         man.showInfo();
		woman.showInfo();
	}

	
}
