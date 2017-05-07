package java.algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfTestCases = in.nextInt();
		
		for (int i = 0; i < noOfTestCases; i++) {
			long noOfPresioners = in.nextInt();
			long noOfSweets = in.nextInt();
			long postion = in.nextInt();
			long lastPossition=0;
	        if(((noOfSweets - 1) + postion) % noOfPresioners == 0){
	            lastPossition = noOfPresioners;
	        } else{
	            lastPossition= ((noOfSweets-1)+postion) % noOfPresioners;
	        }
	        System.out.println(lastPossition);
		}
		
		in.close();
	}

}
