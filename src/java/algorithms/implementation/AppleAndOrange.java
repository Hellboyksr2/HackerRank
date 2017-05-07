package java.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int houseStart = in.nextInt();
        int houseEnd = in.nextInt();
        int appleTreePostion = in.nextInt();
        int orangeTreePostion = in.nextInt();
        int noOfApples = in.nextInt();
        int noOfOranges = in.nextInt();
        
        int noOfApplesFallingInsideHouse = 0;
        int noOfOrangesFallingInsideHouse = 0;
        
        //Get All the Apples in Apple Array
        for(int apple_i=0; apple_i < noOfApples; apple_i++){
            int distance = in.nextInt();
            if(appleTreePostion + distance >= houseStart && appleTreePostion + distance <= houseEnd) {
            	noOfApplesFallingInsideHouse++;
            }
        }
        
        //Get All the Oranges in Apple Array
        for(int orange_i=0; orange_i < noOfOranges; orange_i++){
        	int distance = in.nextInt();
            if(orangeTreePostion + distance >= houseStart && orangeTreePostion + distance <= houseEnd) {
            	noOfOrangesFallingInsideHouse++;
            }
        }
        
        System.out.println(noOfApplesFallingInsideHouse);
        System.out.println(noOfOrangesFallingInsideHouse);
        in.close();
	}

}
