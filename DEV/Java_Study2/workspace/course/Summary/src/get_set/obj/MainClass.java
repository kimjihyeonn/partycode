package get_set.obj;

public class MainClass {
 public static void main(String[] args) {
	Hotel h = new Hotel();
	//��ü�� �Ű������� �����ϴ� ����
	
	
	h.setChef(new Chef());
	
//	Chef c = h.getChef();
//	
//	c.cooking();
//	
	
	h.getChef().cooking();
	
	
	
}
}
