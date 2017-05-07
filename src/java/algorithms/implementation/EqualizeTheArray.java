package java.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfElements = sc.nextInt();
		Map<Integer , Integer> elements = new HashMap<>();
		for (int i = 0; i < noOfElements; i++) {
			int currentElement = sc.nextInt();
			elements.put(currentElement, elements.getOrDefault(currentElement, 0) + 1 );
		}
		sc.close();
		
		Integer mostTimesElemetOccured = null;
		for (Integer element : elements.values()) {
			mostTimesElemetOccured = (mostTimesElemetOccured != null && mostTimesElemetOccured > element) ? mostTimesElemetOccured : element;
		}
		System.out.println(noOfElements - mostTimesElemetOccured);

	}

}
