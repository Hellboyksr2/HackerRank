package java.algorithms.implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String actualString = sc.nextLine();
		sc.close();
		int actualStringlength = actualString.length();
		int rows =  (int) Math.floor(Math.sqrt(actualStringlength));
		int coloumns = (rows * rows >= actualStringlength) ? rows : ((int) Math.ceil(Math.sqrt(actualStringlength)));
		rows = (rows * coloumns < actualStringlength) ? coloumns : rows;
		for(int i=0 ; i < coloumns ; i++ ) {
			for (int j = 0; j < rows; j++) {
				int currentCharacter = i + ( j * coloumns);
				if(actualStringlength > currentCharacter) {
					System.out.print(actualString.charAt(currentCharacter));
				}
			}
			System.out.print(" ");
		}
	}

}
