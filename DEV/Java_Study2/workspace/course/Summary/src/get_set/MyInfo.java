package get_set;

public class MyInfo {
	
	//������� ������ ����.
	
	private int year;
	private int month;
	private int day;
	private String ssn; 
	//�ֹι�ȣ
	
	public MyInfo() {
		
	}
	
	
	
	public MyInfo(int year, int month, int day, String ssn) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.ssn = ssn;
	}



	//�����ϴ� �뵵�� setter�޼���
	
	//- setter �޼���� �ܺη� ���� ���е� ������ ���� �����ϴ� �޼���.
	public void setYear(int year) {
		//����� �߰��� �� ����
		if(year<1950 || year>2021) {
			System.out.println("1950~2021���̰��� �����ϼ���.");
		}
		this.year = year;
		
	}
	
	//getter�޼���
	//-getter�޼���� ���е� ������ ���� ��ȯ�ϴ� �޼���
	public int getYear() {
		return year;
		
		
		
	}
	
	public void setMonth(int month) {
		if(month<1||month>12) {
			System.out.println("1~12���� �Է����ּ���");
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
