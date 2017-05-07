package java.algorithms.implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		long start = in.nextLong();
		long end = in.nextLong();
		long k = in.nextLong();
		in.close();
		long noOfDays = 0;
		
		for (long number = start; number <= end; number++) {
			long reversedNumber = Long.parseLong(new StringBuilder(Long.toString(number)).reverse().toString());
			if(Math.ceil((double)Math.abs(number - reversedNumber) / k) == Math.floor((double)Math.abs(number - reversedNumber) / k)) {
				noOfDays++;
			}
		}
		
		System.out.println(noOfDays);
	}

}
