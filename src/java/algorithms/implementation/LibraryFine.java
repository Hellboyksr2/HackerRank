package java.algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int returnedDay = sc.nextInt();
		int returnedMonth = sc.nextInt();
		int returnedYear = sc.nextInt();
		
		int expectedDay = sc.nextInt();
		int expectedMonth = sc.nextInt();
		int expectedYear = sc.nextInt();
		sc.close();
		
		long amount = 0;
		if(returnedYear > expectedYear) {
			amount = 10000;
		} else if(returnedMonth > expectedMonth && returnedYear == expectedYear) {
			amount = 500 * (returnedMonth - expectedMonth);
		} else if(returnedDay > expectedDay && returnedMonth == expectedMonth && returnedYear == expectedYear) {
			amount = 15 * (returnedDay - expectedDay);
		}
		
		System.out.println(amount);
   
	}

}
