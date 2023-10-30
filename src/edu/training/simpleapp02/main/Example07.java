package edu.training.simpleapp02.main;

public class Example07 {

	public static void main(String[] args) {
		int m = 14;
        int n = 42;
        int k = 36;

        int p = 8;
        int q = 58;
        int r = 37;

        int currentInSeconds = m * 3600 + n * 60 + k;
        int intervalInSeconds = p * 3600 + q * 60 + r;

        int finalInSeconds = currentInSeconds + intervalInSeconds;

        int hoursFinal = (finalInSeconds / 3600);

        int temp = finalInSeconds - (hoursFinal * 3600);
        int minutesFinal = temp / 60;

        int secondsFinal = temp - (minutesFinal * 60);

        int hours24Format = 0;
        if (hoursFinal > 23){
            temp = (hoursFinal / 24);
            hours24Format = hoursFinal - temp * 24;
        }
        else {
            hours24Format = hoursFinal;
        }

        System.out.println("Сейчас: " + m + " ч. " + n + " мин. " + k + " c.");
        System.out.println("Через: " + p + " ч. " + q + " мин. " + r + " c.");
        System.out.println("Будет: " + hours24Format + " ч. " + minutesFinal + " мин. " + secondsFinal + " c.");

	}

}
