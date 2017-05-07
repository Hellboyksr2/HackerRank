package java.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        boolean canMeetAtSamePoint = false;
        
        if(!((x1 < x2 && v1 < v2) || (x1 != x2 && v1 == v2)) && Math.abs(x1-x2) % (v2-v1) ==0) {
        	canMeetAtSamePoint = true;
        }
        
        System.out.println(canMeetAtSamePoint ? "YES" : "NO");
	

	}

}
