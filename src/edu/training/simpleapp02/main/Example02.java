package edu.training.simpleapp02.main;

public class Example02 {

	public static void main(String[] args) {
		double a = 1;
        double b = 3;
        double c = 2;
        
        double x1;
        double x2;

        double d = b * b - 4 * a * c;
        
        if (d < 0) {
        	System.out.println("Уравнение не имеет корней, так как дискриминант отрицательный!");
        	return;
        } else if (d == 0) {
        	x1 = (-b  / (2 * a));
			System.out.println("x = " + x1);
			return;
        } else {
        	x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
		
	}

}
