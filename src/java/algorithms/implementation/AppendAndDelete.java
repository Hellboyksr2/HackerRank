package java.algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String orginalString = sc.nextLine();
		String finalString = sc.nextLine();
		int noOFOperationsAllowed = sc.nextInt();
		sc.close();
		boolean canCreateFinalString = false;
		if(!orginalString.equals(finalString)  && orginalString.length() + finalString.length() > noOFOperationsAllowed) {
			int position = 0;
			for(int i=0 ; i < orginalString.length() && i < finalString.length(); i++) {
				if(orginalString.charAt(i) == finalString.charAt(i)) {
					position++;
				} else {
					break;
				}
			}
			String orginalSubString = orginalString.substring(position);
			String finalSubString = finalString.substring(position);

			if(orginalSubString.length() + finalSubString.length() <= noOFOperationsAllowed 
					&& noOFOperationsAllowed % 2 == (orginalSubString.length() + finalSubString.length()) % 2) {
				canCreateFinalString = true;
			}
			
		} else {
			canCreateFinalString = true;
		}
		System.out.println(canCreateFinalString ? "Yes" : "No");

	}

}
