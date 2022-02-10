package get_set.obj;

public class MainClass {
 public static void main(String[] args) {
	Hotel h = new Hotel();
	//객체를 매개변수로 전달하는 형태
	
	
	h.setChef(new Chef());
	
//	Chef c = h.getChef();
//	
//	c.cooking();
//	
	
	h.getChef().cooking();
	
	
	
}
}
