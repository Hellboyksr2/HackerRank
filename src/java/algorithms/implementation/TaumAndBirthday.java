package java.algorithms.implementation;

import java.util.Scanner;

public class TaumAndBirthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestcases = sc.nextInt();
		
		for (int i = 0; i < numberOfTestcases; i++) {
			long blackGiftsNeeded = sc.nextLong();
			long whiteGiftsNeeded = sc.nextLong();
			long blackGiftCost = sc.nextLong();
			long whiteGiftCost = sc.nextLong();
			long conversionCost = sc.nextLong();
			
			whiteGiftCost = (whiteGiftCost <= blackGiftCost + conversionCost) ? whiteGiftCost : blackGiftCost + conversionCost;
			blackGiftCost = (blackGiftCost <= whiteGiftCost + conversionCost) ? blackGiftCost : whiteGiftCost + conversionCost;
			System.out.println((whiteGiftsNeeded * whiteGiftCost) + (blackGiftsNeeded * blackGiftCost));
		}

	}

}
