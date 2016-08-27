package se.movlin.hackerrank.thirtyoperators;

import java.util.Scanner;

public class Arithmetic {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        int totalCost = calcMealCost(mealCost, tipPercent, taxPercent);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars");
    }

	protected static int calcMealCost(double mealCost, int tipPercent, int taxPercent) {
		// Write your calculation code here.
        double cost = mealCost + (mealCost * (tipPercent / 100.0)) + (mealCost * (taxPercent / 100.0));
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(cost);
		return totalCost;
	}


}
