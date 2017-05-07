package java.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		BigInteger factValue = BigInteger.valueOf(number);
		for (int i = number -1 ; i > 1; i--) {
			factValue = factValue.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(factValue);
	
	}

}
