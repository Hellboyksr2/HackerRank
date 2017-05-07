package java.algorithms.implementation;

import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int persons = sc.nextInt();
		int topics = sc.nextInt();
		int maxNoOfTopicsTeamKnows = 0;
		int countOfTeams = 0;
		sc.skip("\n");
		
		String[] topicsPersonKnows = new String[persons];
		for (int i = 0; i < persons; i++) {
			topicsPersonKnows[i] = sc.nextLine();
		}
		sc.close();
		
		for (int i = 0; i < persons; i++) {
			for (int j = i+1; j < persons; j++) {
				int numberOfTopicsCurrentTeamKnows = noOfTopicsKnows(topicsPersonKnows[i] , topicsPersonKnows[j]);
				if(numberOfTopicsCurrentTeamKnows > maxNoOfTopicsTeamKnows) {
					maxNoOfTopicsTeamKnows = numberOfTopicsCurrentTeamKnows;
					countOfTeams = 1;
				} else if(numberOfTopicsCurrentTeamKnows == maxNoOfTopicsTeamKnows) {
					countOfTeams++;
				}
			}
		}
		System.out.println(maxNoOfTopicsTeamKnows);
		System.out.println(countOfTeams);
    }
    
    public static int noOfTopicsKnows(String firstPerson ,String secondPerson) {
		int count = 0;
		for (int i = 0; i < firstPerson.length() ; i++) {
			if(firstPerson.charAt(i)  == '1' || secondPerson.charAt(i)  == '1') {
				count++;
			}
		}
		return count;
	}

}
