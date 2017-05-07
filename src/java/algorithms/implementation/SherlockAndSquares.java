package java.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for (int i = 0; i < noOfTestCases; i++) {
			long start = sc.nextInt();
			long end = sc.nextInt();
			long count = 0;
			for (double j = Math.floor(Math.sqrt(start)) ; j <= Math.ceil(Math.sqrt(end)); j++) {
				if(j * j >= start && j * j <= end) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
