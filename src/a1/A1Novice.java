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
		
		
		int numberOfItems = 0;
		double price = 0;
		
		// read values into array
		
		
		for (int i = 0; i < customers.length; i++) {
			System.out.println("First Name");
			String firstName = scan.next();
			System.out.println("Last Name");
			String lastName = scan.next();
			customers[i] = firstName + lastName;
			System.out.println("Total Items Bought by the customer");
			numberOfItems = scan.nextInt();
			
			
			int[] numberBought = new int[numberOfItems];
			for (int c = 0; c < numberBought.length; c++) {
				if (c == 0) {
					price = 0;
				}
				System.out.println("Amount of that specific item");
				numberBought[c] = scan.nextInt();
				System.out.println("Name of that item");
				String nameOfItem = scan.next();
				System.out.println("Price of the item");
				price += scan.nextInt() * numberBought[c];
				System.out.println(firstName.charAt(0) + "." +  lastName + ":" + price);
				
				
			}
			}
	}
}
		
		

		
	
	

