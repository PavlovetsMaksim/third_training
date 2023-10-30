package edu.training.simpleapp02.main;

public class Example03 {

	public static void main(String[] args) {
		double a = 11;
        double b = 14;
        double y = 150;

        double yRad = y * Math.PI / 180.0;

        double s = 0.5 * a * b * Math.sin(yRad);

        System.out.println("S = " + s);

	}

}
