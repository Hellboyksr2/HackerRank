package java.algorithms.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfSticks = sc.nextInt();
		Integer minLengthStick = null;
		Integer[] sticks = new Integer[noOfSticks];
		int sticksAlreadyCutted = 0;
		for(int i = 0 ; i < noOfSticks ; i++) {
			sticks[i] = sc.nextInt();
			minLengthStick = (minLengthStick != null && minLengthStick < sticks[i]) ? minLengthStick : sticks[i];
			sticksAlreadyCutted+= (sticks[i] <= 0) ? 1 : 0;
		}
		sc.close();
		
		while(sticksAlreadyCutted != noOfSticks) {
			System.out.println(noOfSticks - sticksAlreadyCutted);
			sticksAlreadyCutted = 0;
			Integer tempMinLengthStick = null;
			for(int i = 0 ; i < noOfSticks ; i++) {
				sticks[i] = (sticks[i] != null && sticks[i] - minLengthStick > 0 ) ? sticks[i] - minLengthStick : null;
				sticksAlreadyCutted+= (sticks[i] == null) ? 1 : 0;
				if(sticks[i] != null) {
					tempMinLengthStick = (tempMinLengthStick != null && tempMinLengthStick < sticks[i]) ? tempMinLengthStick : sticks[i];
				}
			}
			minLengthStick = tempMinLengthStick;
		}

	}

}
