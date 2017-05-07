package java.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		final String SPACE = " ";
		final String HASH = "#";
		Scanner in = new Scanner(System.in);
		int numberOfHashs = in.nextInt();
		for(int currentRow = 1 ; currentRow <= numberOfHashs ; currentRow++) {
			String string = "";
			for(int currentCell = 1; currentCell <= numberOfHashs; currentCell++ ) {
				string+= (currentCell<=numberOfHashs-currentRow) ? SPACE : HASH;
			}
			System.out.println(string);
		}

	}

}
