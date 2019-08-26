package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Read in count of numbers to process
		
		System.out.println("Number of customers");
		int count = scan.nextInt();
		
		// Create array to store numbers
		
		String[] customers = new String[count];
		
		// Create array to store prices as they accumulate for each customer 
		double[] prices = new double[count];
		
		
		// Initialize a price that will be adjusted later on
		int price = 0;
	
		// read values into array
		
		// Creates an array of customers
		
		for (int i = 0; i < customers.length; i++) {
			// System.out.println("First Name");
			String firstName = scan.next();
			//System.out.println("Last Name");
			String lastName = scan.next();
			//Stores the names of customers into the array
		 
			customers[i] = firstName.charAt(0) + "." + lastName;
			// System.out.println("Total Items Bought by the customer");
			int numberOfItems = scan.nextInt();
			
			// Create an array of number of items bought for each customer within the initial array
			int[] numberBought = new int[numberOfItems];
			for (int c = 0; c < numberBought.length; c++) {
				// Resets the price for the next customer in the initial array
				if (c == 0) {
					price = 0;
				}
				//System.out.println("Amount of that specific item");
				
				// Builds out the array that is the size of the number of items bought for each customer, and each element of that array contains number of a specific item bought 
				numberBought[c] = scan.nextInt();
				// System.out.println("Name of that item");
				String nameOfItem = scan.next();
				// System.out.println("Price of the item");
				
				// Accumulates the price of the items for that customer as it loops through the array of items bought for a customer
				
				price += scan.nextDouble() * numberBought[c];
			}
			
			// adds the price of that customer to a new price array
			prices[i] = price;
			}
		//iterates through each customer and prints out their names and price paid
		for (int a = 0; a < customers.length; a++) {
			System.out.println(customers[a] + ": " + price);
		}
		
	}
}
		
		

		
	
	

