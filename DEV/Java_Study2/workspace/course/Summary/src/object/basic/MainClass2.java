package object.basic;

public class MainClass2 {

	public static void main(String[] args) {
		
         Account myAcc = new Account("È«±æµ¿","1234",3600);
         
         myAcc.deposit(800);
         myAcc.withdrow(1900);
         
         int bal =myAcc.getBalance();
         
         System.out.println(myAcc.name+"´ÔÀÇ °èÁÂÀÜ¾×Àº"+bal+"¿øÀÔ´Ï´Ù");
 }
	
}
