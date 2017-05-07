package java.algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		long length = sc.nextLong();
		sc.close();
		
		long count = (long) (Math.floor(length /string.length()) * getNumberOfAInString(string));
		int subStringIndex = (int) (length % string.length());
		if(subStringIndex != 0) {
			count +=  getNumberOfAInString(string.substring(0 , subStringIndex));
		}
		System.out.println(count);
    }
    
    public static long getNumberOfAInString(String string) {
		long count = 0;
		for(char c : string.toCharArray()) {
			if(c == 'a') {
				count++;
			}
		}
		return count;
	}

}
