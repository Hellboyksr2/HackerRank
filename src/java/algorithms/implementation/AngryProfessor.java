package java.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfTestCases = in.nextInt();
		
		for (int i = 0; i < noOfTestCases; i++) {
			int numberOfStudents = in.nextInt();
			int threshold = in.nextInt();
			int numberOfStudentsPresent = 0;
			for (int student = 0; student < numberOfStudents; student++) {
				if(in.nextInt() <= 0) {
					numberOfStudentsPresent++;
				}
			}
			System.out.println(numberOfStudentsPresent < threshold ? "YES" : "NO");
		}
		in.close();
	}

}
