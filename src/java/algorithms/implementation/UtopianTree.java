package java.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfTestCases = in.nextInt();
		
		for(int i=0 ; i< noOfTestCases ; i++) {
			int utopianTreeHeight = 1;
			int noOfCycles = in.nextInt();
			for(int cycle = 1 ; cycle <= noOfCycles; cycle++) {
				utopianTreeHeight+= ( cycle % 2 == 0) ? 1 : utopianTreeHeight;
			}
			System.out.println(utopianTreeHeight);
		}
		
		in.close();

	}

}
