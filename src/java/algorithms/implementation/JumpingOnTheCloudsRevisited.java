package java.algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfClouds = sc.nextInt();
		int noOfCloudsToJump = sc.nextInt();
		int[] cloudDetails = new int[noOfClouds];
		for (int i = 0; i < noOfClouds; i++) {
			cloudDetails[i] = sc.nextInt();
		}
		sc.close();
		int currentCloud = 0;
		int energy = 100;
		do {
			currentCloud = (currentCloud + noOfCloudsToJump) % noOfClouds;
			energy-= (cloudDetails[currentCloud] == 0) ? 1 : 3;
		} while (currentCloud != 0);
		System.out.println(energy);
	

	}

}
