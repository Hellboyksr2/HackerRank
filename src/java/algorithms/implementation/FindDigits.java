package java.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for (int i = 0; i < noOfTestCases; i++) {
			long evenlyDivisableDigits = 0;
			long actualNumber = sc.nextLong();
			long currentNumber = actualNumber;
			while(currentNumber != 0) {
				long digit = currentNumber % 10;
				evenlyDivisableDigits+= (digit !=0 && actualNumber % digit == 0) ? 1 : 0;
				currentNumber = currentNumber/10;
			}
			System.out.println(evenlyDivisableDigits);
		}
		sc.close();
	}

}
