package edu.training.simpleapp02.main;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("Enter one character > ");
		
		str = sc.next();
		
		sc.close();
		
		char curCh = str.charAt(0);

        int asciiCur = (int)curCh;

        int asciiPrev = asciiCur - 1;
        char prevCh = (char)asciiPrev;

        int asciiNext = asciiCur + 1;
        char nextCh = (char) asciiNext;

        System.out.println("Исходный символ: " + curCh + ", его номер: " + asciiCur);
        System.out.println("Предыдущий символ: " + prevCh + ", его номер: " + asciiPrev);
        System.out.println("Следующий символ: " + nextCh + ", его номер: " + asciiNext);
		
	}

}
