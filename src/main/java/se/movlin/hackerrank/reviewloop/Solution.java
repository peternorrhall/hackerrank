package se.movlin.hackerrank.reviewloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Solution {

	public static void main(String[] args) {
		List<String> strings = readInput();
		
		for(String string : strings) {
			printString(string.toCharArray(), (i) -> i % 2 == 0);
			System.out.print(" ");
			printString(string.toCharArray(), (i) -> i % 2 == 1);
			System.out.println("");
		}

	}
	
	private static void printString(char[] string, IntPredicate f) {
		for (int i = 0; i<string.length; i++) {
			if (f.test(i)) {
				System.out.print(string[i]);
			}
		}		
	}
	
	protected static List<String> readInput() {
		List<String> strings;
		int nrOfStrings;
		Scanner scanner = new Scanner(System.in);
		nrOfStrings = scanner.nextInt(); scanner.nextLine();
		strings = new ArrayList<String>(nrOfStrings);
		for (int i = 0; i < nrOfStrings; i++) {
			strings.add(scanner.nextLine());
		}
		scanner.close();
		return strings;
	}
	

}
