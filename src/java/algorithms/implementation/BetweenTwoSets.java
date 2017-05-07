package java.algorithms.implementation;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	        int[] b = new int[m];
	        
	        Integer maxNumber = null;
	        int total = 0;
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        
	        for(int b_i=0; b_i < m; b_i++){
	            b[b_i] = in.nextInt();
	            maxNumber = maxNumber != null && maxNumber <= b[b_i] ? maxNumber : b[b_i];
	        }
	        
	        in.close();
	        
	        for(int number = maxNumber ; number > 0 ; number--) {
	        	boolean isBetweenSets = true;
	        	for(int a_i=0; a_i < n; a_i++) {
	        		if(number % a[a_i] != 0) {
	        			isBetweenSets = false;
	        		}
	        	}
	        	
	        	for(int b_i=0; b_i < m; b_i++) {
	        		if( b[b_i] % number != 0) {
	        			isBetweenSets = false;
	        		}
	        	}
	        	
	        	total += isBetweenSets ? 1 : 0;
	        }
	        System.out.println(total);
	}

}
