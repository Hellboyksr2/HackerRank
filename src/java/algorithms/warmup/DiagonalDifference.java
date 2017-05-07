package java.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfrows = in.nextInt();
		long primaryDiagnal = 0;
		long secondaryDiongnal = 0;
		for(int row = 1 ; row <= numberOfrows ; row++) {
			for(int coloumn = 1 ; coloumn <= numberOfrows ; coloumn++) {
				long currentCellValue = in.nextLong();
				if(row == coloumn) {
					primaryDiagnal+= currentCellValue;
				}
				if(numberOfrows - coloumn == row-1) {
					secondaryDiongnal+= currentCellValue;
				}
			}
		}
		System.out.println(Math.abs(secondaryDiongnal-primaryDiagnal));
	}

}
