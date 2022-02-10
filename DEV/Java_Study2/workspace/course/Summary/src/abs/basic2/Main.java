package abs.basic2;

public class Main {
  public static void main(String[] args) {
	
	  HeadStore h = new Store();
	  
	  System.out.println(h.name);
	  
	  h.melon(); // override
	  h.orange();// override
	  h.peach();//override
	  h.grape(); // »ó¼Ó
	  
}
}
