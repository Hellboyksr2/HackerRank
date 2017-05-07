package java.algorithms.implementation;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int[] h = new int[26];
	        for(int h_i=0; h_i < 26; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        Integer maxHeight = null;
	        for (Byte b : word.getBytes()) {
	        	maxHeight = maxHeight != null && maxHeight > h[b%97] ? maxHeight : h[b%97];
			}
	        System.out.println(word.length() * maxHeight);
	        in.close();

	}

}
