package java.algorithms.implementation;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int noOfElments = in.nextInt();
	        int noOfRotations = in.nextInt();
	        int noOfQuestions = in.nextInt();
	        int[] arrayOfIntegers = new int[noOfElments];
	        
	        //To Populate the Integer Array For Recurssion
	        for(int index=0; index < noOfElments; index++){
	        	int currentPosition = (index + noOfRotations) < noOfElments ? (index + noOfRotations) :  ((noOfRotations + index) % noOfElments);
	        	arrayOfIntegers[currentPosition] = in.nextInt();
	        }
	     
	        for(int a0 = 0; a0 < noOfQuestions; a0++){
	            int m = in.nextInt();
	            System.out.println(arrayOfIntegers[m]);
	        }
	    
	    in.close();

	}

}
