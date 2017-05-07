package java.algorithms.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfSocks = in.nextInt();
		Set<Integer> uniqueSockes = new HashSet<>();
		int pairs = 0;
		for(int i = 0 ; i < noOfSocks ; i++) {
			int currentSocksColor = in.nextInt();
			if(!uniqueSockes.add(currentSocksColor)) {
				pairs++;
				uniqueSockes.remove(currentSocksColor);
			}
		}
		in.close();
		System.out.println(pairs);
	}

}
