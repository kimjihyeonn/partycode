package ������_�⺻����;

//Ŭ���� �ܺο� ������ �ۼ� ���
enum City {
	SEOUL(950,"����"),BUSAN(200,"����"),JEJU(60,"����");
	int population; //�α�
	String cityName;
	//������
	private City(int population,String name) {
		this.population=population;
		cityName=name;
	}
	//�޼ҵ�
	public int getpopulation() {
		return population;
		
	}
	public String getcityName() {
		return cityName;
	}
	
}

public class EnumlnstMember {

	public static void main(String[] args) {
		System.out.println(City.SEOUL.getcityName()+"�� �α���:"+City.SEOUL.getpopulation());

	}

}
