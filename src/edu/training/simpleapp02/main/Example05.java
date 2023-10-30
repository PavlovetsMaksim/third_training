package edu.training.simpleapp02.main;

public class Example05 {

	public static void main(String[] args) {
		double initRad = 0.53;
        double initDegr = initRad * 180 / Math.PI;

        int degrees = (int) initDegr;

        double temp = (initDegr - degrees) * 60;
        int minutes = (int) temp;

        double seconds = (temp - minutes) * 60;

        System.out.println("Исходная мера угла в радианах: " + initRad);
        System.out.println(degrees + " гр. " + minutes + " мин. " + seconds + " c.");
		
	}

}
