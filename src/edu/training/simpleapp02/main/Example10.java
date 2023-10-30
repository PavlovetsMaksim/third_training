package edu.training.simpleapp02.main;

public class Example10 {

	public static void main(String[] args) {
		int m = 812;
        int n = 6;

        double result = (double) m / n;

        int junior = (int)(result % 10);
        int senior = (int)((result * 10) % 10);

        System.out.println(m + " / " + n + " = " + result);
        System.out.println("Старшая цифра дробной части: " + senior);
        System.out.println("Младшая цифра целой части: " + junior);

	}

}
