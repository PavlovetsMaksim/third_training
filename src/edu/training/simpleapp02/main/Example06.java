package edu.training.simpleapp02.main;

public class Example06 {

	public static void main(String[] args) {
		double a = 3;
        double b = 4;
        double c = 5;

        double cornerARad = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double cornerADegr = cornerARad * 180 / Math.PI;

        double cornerBRad = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double cornerBDegr = cornerBRad * 180 / Math.PI;

        double cornerCRad = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        double cornerCDegr = cornerCRad * 180 / Math.PI;

        System.out.println("Исходный треугольник со сторонами " + a + " " + b + " " + c);
        System.out.println("Угол 1 = " + cornerARad + " рад. " + cornerADegr + " гр.");
        System.out.println("Угол 2 = " + cornerBRad + " рад. " + cornerBDegr + " гр.");
        System.out.println("Угол 3 = " + cornerCRad + " рад. " + cornerCDegr + " гр.");

	}

}
