package iaccess.di.ui;

public class MonoPrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println("====(monoprint)");
		System.out.println(msg);
		System.out.println("=====mono-end===");
	}

}
