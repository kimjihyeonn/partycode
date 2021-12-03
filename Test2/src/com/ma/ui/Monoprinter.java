package com.ma.ui;

public class Monoprinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println("====(monoprint)");
		System.out.println(msg);
		System.out.println("========");
	}

}
