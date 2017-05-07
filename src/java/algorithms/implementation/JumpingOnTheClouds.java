package java.algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfClouds = sc.nextInt();
		int steps = 0;
		int[] clouds = new int[numberOfClouds];
		for (int i = 0; i < numberOfClouds; i++) {
			clouds[i] = sc.nextInt();
		}
		sc.close();
		//Logic to Get the Count 
		for (int i = 0; i < clouds.length - 1; i++) {
			steps++;
			i+= (clouds[i] == 0) ? 1 : 0;
		}
		System.out.println(steps);

	}

}
