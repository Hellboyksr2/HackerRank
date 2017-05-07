package java.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        long sum = 0;
	        Long minValue = null;
	        Long maxValue = null;
	        for(int i = 0 ; i < 5 ; i++) {
	        	long currentValue = in.nextLong();
	        	sum+=currentValue;
	        	minValue = (minValue != null && minValue < currentValue) ? minValue : currentValue;
	        	maxValue = (maxValue != null && maxValue > currentValue) ? maxValue : currentValue;
	        }
	        System.out.println((sum - maxValue) + " " + (sum - minValue));
	}

}
