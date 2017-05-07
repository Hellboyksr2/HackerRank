package java.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double totalNoOfElements = in.nextInt();
		double noPositiveInteger = 0;
		double noNegativeInteger = 0;
		double noOfZeros = 0;
		for(int currentElement = 1; currentElement <= totalNoOfElements ; currentElement++) {
			int currentInteger = in.nextInt();
			if(currentInteger > 0) {
				noPositiveInteger+=1;
			}	else if(currentInteger < 0) {
				noNegativeInteger+=1;
			} else {
				noOfZeros+=1;
			}
		}
		System.out.format("%.6f \n", noPositiveInteger/totalNoOfElements);
		System.out.format("%.6f \n", noNegativeInteger/totalNoOfElements);
		System.out.format("%.6f \n", noOfZeros/totalNoOfElements);
	
	}

}
