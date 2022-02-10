package get_set;

public class Mainclass {
	
	public static void main(String[] args) {
	     MyInfo meInfo= new MyInfo();
	     meInfo.setYear(1966);
	    System.out.println(meInfo.getYear());
	     
	    meInfo.setMonth(13);
	    meInfo.setMonth(12);
	    
	    System.out.println(meInfo.getMonth());
	}

}
