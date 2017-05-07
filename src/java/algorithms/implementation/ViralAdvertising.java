package java.algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			int numberOfDays = in.nextInt();
			in.close();
			long total = 2;
			double numberOfPeopleliked = 2;
			
			for (int i = 2; i <= numberOfDays; i++) {
				numberOfPeopleliked= Math.floor((numberOfPeopleliked * 3) / 2);
				total+=numberOfPeopleliked;
			}
			
			System.out.println(total);
	}

}
