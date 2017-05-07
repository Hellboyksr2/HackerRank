package java.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int aSum = 0 , bSum = 0;
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        b[0] = in.nextInt();
        b[1] = in.nextInt();
        b[2] = in.nextInt();
        
        for(int i =0 ; i <3 ; i++) {
            if(a[i] > b[i]) {
                aSum = aSum + 1;
            } else if(a[i] < b[i]){
                bSum = bSum + 1;
            }
        }
        
        System.out.println( aSum + " " + bSum);
	}

}
