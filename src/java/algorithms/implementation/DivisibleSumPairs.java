package java.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        int numberOfPaires = 0;
        for(int i=0 ; i < n ;i++) {
        	for(int j=0 ; j < n ; j++){
        		if( i != j && i < j && (a[i] + a[j]) % k == 0) {
        			numberOfPaires++;
        		}
        	}
        }
        System.out.println(numberOfPaires);

	}

}
