package quiz01;

import java.util.ArrayList;

public class ArrayClass {
	
  public ArrayList array(){
		
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add(0,"������");
		name.add(1,"������");
		name.add(2,"������");
		
		System.out.println(name);
		return name;

	}

	public static void main(String[] args) {
		ArrayClass mynames = new ArrayClass();
		
		ArrayList i = mynames.array();

	}

}
