package This;
/**
 * this�� this()������
 * super�� super()������
 * ----------------------------------------------------
 * this : �ν��Ͻ� �ڽ��� ����Ű�� ���� ����
 * this() : �����ڷ� ���� Ŭ������ �ٸ� �����ڸ� ȣ�� �� ���
 * 
 * 
 * 
 */
//'A' ��� ������ �л��̶�� ����
 class Person{
	//�ʵ弱��
	private int juminNum; // �ֹι�ȣ
	private String militaryNum;// ����
	private int birthYear; //����⵵
	private int birthMonth; ///�����
	private int birthDay; //�����
    //������
	public Person(int juminNum,String militaryNum,int bYear,int bMonth,int bDay) {
		
		this(41,23,43,23);
		/*this.juminNum=juminNum;
		
		this.militaryNum = militaryNum;
		birthYear=bYear;
		birthMonth =bMonth;
		birthDay=bDay;*/
		
	} 
	 


	public Person(int juminNum,int bYear,int bMonth,int bDay) {
		
//		this(juminNum,"�����������",bYear,bMonth,bDay);
		/*
        this.juminNum=juminNum;
		this.militaryNum = 0;  //������ 0�̸� ���� �������
		birthYear=bYear;
		birthMonth =bMonth;
		birthDay=bDay;*/
	}
	//�޼ҵ� ����
	public void showInfo() {
		System.out.println("�ֹι�ȣ:" + juminNum );
		
		System.out.println("����⵵:" + birthYear+birthMonth+ birthDay );
		
	if(militaryNum!="�����������") {
		System.out.println("���� :" + militaryNum +"\n");
		
	
	}else {
		System.out.println("���� ���� ����" );
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
