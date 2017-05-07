package java.algorithms.implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long start = sc.nextLong();
		Long end = sc.nextLong();
		sc.close();
		long[] values = new long[(int) (end - start + 1)];
		int numberOfElemets = 0;
		for (Long i = start; i <= end; i++) {
			String squareValue = Long.valueOf(i * i).toString();
			int length = squareValue.length();
			int center = (int) Math.ceil(length/2.0);
			if(length == center && i.intValue() == Long.valueOf(i * i).longValue()) {
				values[numberOfElemets++] = i;
			} else if(length != center && Integer.valueOf(squareValue.substring( 0 , center+center > length ? center-1 : center)) + Integer.valueOf(squareValue.substring(length - center)) == i) {
				values[numberOfElemets++] = i;
			}
		}
		
		if(numberOfElemets == 0) {
			System.out.println("INVALID RANGE");
		} else {
			for (int i = 0; i < numberOfElemets; i++) {
				System.out.print(values[i] + " ");
			}
		}

	}

}
