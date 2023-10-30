package edu.training.simpleapp02.main;

public class Example01 {

	public static void main(String[] args) {
		double d = 123.456;
		
		double a = (int)d / 1000.0;
		
		double b = (int)((d - (int)d) * 1000);
		
		double res = a + b;
		
		System.out.println(res);
	}

}
