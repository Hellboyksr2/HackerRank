package java.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String dateIn12HrFormat = in.nextLine();
		int hour = Integer.parseInt(dateIn12HrFormat.substring(0,2));
		if(dateIn12HrFormat.contains("PM")) {
			dateIn12HrFormat = (hour == 12 ? hour : (hour + 12))  + dateIn12HrFormat.substring(2, dateIn12HrFormat.length() - 2);
		} else {
			dateIn12HrFormat = (hour == 12 ? "00" : (hour < 10 ? ("0" + hour) : hour))  + dateIn12HrFormat.substring(2, dateIn12HrFormat.length() - 2);
		}
		System.out.println(dateIn12HrFormat);

	}

}
