package se.movlin.hackerrank.conditionalstatements;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		scan.close();
		String ans = isWeirdNumber(n);
		System.out.println(ans);
	}

	protected static String isWeirdNumber(int n) {
		String ans="";
		if ( n < 1 || n > 100)
			return ans;
		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if(n%2==1){
			ans = "Weird";
		}
		else{
			if (2 <= n && n <= 5) {
				ans = "Not Weird";
			} else if (6 <= n && n <= 20) {
				ans = "Weird";
			} else {
				ans ="Not Weird";
			}
		}
		return ans;
	}

}
