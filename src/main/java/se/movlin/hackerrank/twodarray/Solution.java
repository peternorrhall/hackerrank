package se.movlin.hackerrank.twodarray;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(maxHourGlass(arr));
        in.close();
    }

	protected static int maxHourGlass(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length -2 ; i++) {
			for (int j = 0; j < arr[0].length -2; j++) {
				int c = calcHourGlass(arr, i, j);
				max = max <= c ? c : max;
			}
		}
		return max;
	}
	
	protected static int calcHourGlass(int[][] arr, int startX, int startY) {
		int result = arr[startX][startY] + 
					 arr[startX][startY + 1] +
					 arr[startX][startY + 2] +
					 arr[startX + 1][startY + 1] +
					 arr[startX + 2][startY] +
					 arr[startX + 2][startY + 1] +
					 arr[startX + 2][startY + 2];
		return result;
	}
    
}
