package 열거형_기본예제;

//클래스 외부에 열거형 작성 방법
enum City {
	SEOUL(950,"서울"),BUSAN(200,"서울"),JEJU(60,"서울");
	int population; //인구
	String cityName;
	//생성자
	private City(int population,String name) {
		this.population=population;
		cityName=name;
	}
	//메소드
	public int getpopulation() {
		return population;
		
	}
	public String getcityName() {
		return cityName;
	}
	
}

public class EnumlnstMember {

	public static void main(String[] args) {
		System.out.println(City.SEOUL.getcityName()+"의 인구수:"+City.SEOUL.getpopulation());

	}

}
