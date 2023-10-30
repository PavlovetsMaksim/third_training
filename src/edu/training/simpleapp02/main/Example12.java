package edu.training.simpleapp02.main;

public class Example12 {

	public static void main(String[] args) {
		//part 1
        int n1 = 22;

        if (n1 / 100 == 0 && n1 % 2 == 0) {
            System.out.print("1)True");
        }
        else{
            System.out.print("1)False");
        }

        System.out.println();
        
        //part 2
        int n2 = 1034;

        int sum1 = 0;
        int newNumber = n2;
        int count = 0;
        while (count < 2) {
            sum1 = sum1 + (newNumber % 10);
            newNumber = newNumber / 10;
            count++;
        }

        int sum2 = 0;
        count = 0;
        while (count < 2) {
            sum2 = sum2 + (newNumber % 10);
            newNumber = newNumber / 10;
            count++;
        }

        if (sum1 == sum2) {
            System.out.print("2)True");
        }
        else{
            System.out.print("2)False");
        }
        
        System.out.println();
        
        //part 3
        int n3 = 122;

        int sum3 = 0;
        int newNumber3 = n3;
        count = 0;
        while (count < 3) {
            sum3 = sum3 + (newNumber3 % 10);
            newNumber3 = newNumber3 / 10;
            count++;
        }

        if (sum3 % 2 == 0) {
            System.out.print("3)True");
        }
        else{
            System.out.print("3)False");
        }
        
        System.out.println();

        //part 4
        int x = 1;
        int m = 2;
        int n = 3;

        if (x >= m && x <= n) {
            System.out.print("3)True");
        }
        else{
            System.out.print("3)False");
        }
        
        System.out.println();
        
        //part 5
        int n5 = 111;
        int sum5 = 0;
        int newNumber5 = n5;
        count = 0;
        while (count < 3) {
            sum5 = sum5 + (newNumber5 % 10);
            newNumber5 = newNumber5 / 10;
            count++;
        }

        if (n5 * n5 == Math.pow(sum5, 3)) {
            System.out.print("5)True");
        }
        else{
            System.out.print("5)False");
        }
        
        System.out.println();

        //part 6
        double a = 3.0;
        double b = 2.0;
        double c = 2.0;

        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.print("6)True");
        }
        else{
            System.out.print("6)False");
        }
        
        System.out.println();

        //part 7
        int n7 = 583;

        int newNumber7 = n7;
        int digit1 = newNumber7 % 10;
        newNumber7 = newNumber7 / 10;
        int digit2 = newNumber7 % 10;
        newNumber7 = newNumber7 / 10;
        int digit3 = newNumber7 % 10;

        if (digit1 + digit2 == digit3 || digit1 + digit3 == digit2 || digit3 + digit2 == digit1) {
            System.out.print("7)True");
        }
        else{
            System.out.print("7)False");
        }
        
        System.out.println();

        //part 8
        int n8 = 32;
        int a8 = 2;

        if ((n8 == 1) || (n8 == a8) || (n8 == a8 * a8) || (n8 == Math.pow(a8, 3)) || ((n8 == Math.pow(a8, 4)))) {
            System.out.print("8)True");
        }
        else{
            System.out.print("8)False");
        }
        
        System.out.println();
        
        //part 9
        double a9 = 1.0;
        double b9 = 3.0;
        double c9 = -4.0;
        double x9 = 1.0;
        double y9 = 0.0;
        
        if (y9 == a9 * x9 * x9 + b9 * x9 + c9) {
            System.out.print("9)True");
        }
        else{
            System.out.print("9)False");
        }
        
        System.out.println();
	}

}
