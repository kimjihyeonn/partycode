package get_set;

public class MyInfo {
	
	//사용자의 정보를 저장.
	
	private int year;
	private int month;
	private int day;
	private String ssn; 
	//주민번호
	
	public MyInfo() {
		
	}
	
	
	
	public MyInfo(int year, int month, int day, String ssn) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.ssn = ssn;
	}



	//저장하는 용도의 setter메서드
	
	//- setter 메서드는 외부로 부터 은닉된 변수의 값을 저장하는 메서드.
	public void setYear(int year) {
		//기능을 추가할 수 있음
		if(year<1950 || year>2021) {
			System.out.println("1950~2021사이값을 저장하세요.");
		}
		this.year = year;
		
	}
	
	//getter메서드
	//-getter메서드는 은닉된 변수의 값을 반환하는 메서드
	public int getYear() {
		return year;
		
		
		
	}
	
	public void setMonth(int month) {
		if(month<1||month>12) {
			System.out.println("1~12값을 입력해주세요");
		}
		this.month=month;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
