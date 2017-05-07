package java.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			long numberOfItems = in.nextLong();
			long alergyItem = in.nextLong();
			long totalAmount = 0;
			long allergyItemPrice = 0;
			long amountAnnaPaid = 0;
			
			for(int item =0; item < numberOfItems ; item++) {
				long currentItemPrice = in.nextLong();
				totalAmount+=currentItemPrice;
				if(item == alergyItem) {
					allergyItemPrice = currentItemPrice;
				}
			}
			amountAnnaPaid = in.nextLong();
			
			System.out.println((totalAmount -allergyItemPrice) / 2 == amountAnnaPaid ? "Bon Appetit" : allergyItemPrice/2);
			
			in.close();
	}

}
