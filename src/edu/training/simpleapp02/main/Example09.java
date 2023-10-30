package edu.training.simpleapp02.main;

public class Example09 {

	public static void main(String[] args) {
		long a = 1000000000000L;

        double kBytes = a / Math.pow(2, 10);
        double mBytes = a / Math.pow(2, 20);
        double gBytes = a / Math.pow(2, 30);
        double tBytes = a / Math.pow(2, 40);

        System.out.println(a + " байт");

        System.out.println(kBytes + " Кб");
        System.out.println(mBytes + " Мб");
        System.out.println(gBytes + " Гб");
        System.out.println(tBytes + " Тб");

	}

}
