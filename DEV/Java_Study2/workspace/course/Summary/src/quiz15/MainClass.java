package quiz15;

public class MainClass {

	public static void main(String[] args) {
		User user = new User("È«±æµ¿",123123,20);
		
		User[] use = new User[2];
		User user2 = new User("±è±æµ¿",456456,30);
		
		use[0]= user;
		use[1]= user2;
		
		for(User u: use) {
			
			System.out.println(u.getName());
			System.out.println(u.getRrn());
			System.out.println(u.getAge());
			
			
		}
	
		
		
		
	}
	
	
	
	
}
