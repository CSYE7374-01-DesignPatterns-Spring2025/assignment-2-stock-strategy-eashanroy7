package edu.neu.csye7374;

/**
 * 
 * @author Eashan Roy
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

         //Add your code in between these two print statements
		StockMarket.getInstance().startTrading();
		 
		System.out.println("\n\n============Main Execution End===================");
	}

}
