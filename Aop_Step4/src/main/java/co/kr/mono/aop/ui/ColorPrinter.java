package co.kr.mono.aop.ui;

public class ColorPrinter implements Printer {

	public void print(String msg) {
        System.out.println("---color-----");
		
		System.out.println(msg);
		
		System.out.println("-----color-end----");
		
	}


	

}
