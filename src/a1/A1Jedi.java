package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// an integer count of number of items in the store
		
		//System.out.println("Number of Items in the store");
		int count = scan.nextInt();
		int counterVariable = 0;
		int quantityBought = 0;
		int itemsBoughtByCustomer = 0;
		int newCounterVariable = 0;
		String nameOfItem = "";
		String firstName = "";
		String lastName = "";
				
		//initialize the price spent by each customer
		double spent = 0;
		int itemsBought = 0;
				
		//an array for the number of items in the store to choose from
		String[] itemsInStore = new String[count];
				
		//an array of prices for each of the items in the store; used later on to figure out how much each customer spends
		double[] arrayOfPrices = new double [count];
				
				
		// Loop through the ItemsInStore array and fill with user input regarding specific items in that store
				
		for (int i = 0; i < itemsInStore.length; i++) {
			//System.out.println("Name of item");
			itemsInStore[i] = scan.next();
		//	System.out.println("Price of the item");
			// store the data regarding prices into a new array
			arrayOfPrices[i] = scan.nextDouble();
		}
				
		// number of customers in the store
	  //  System.out.println("Number of customers shopping");
		int numberOfCustomers = scan.nextInt();
		int[] itemCounter = new int [count];
		int[] customerCounter = new int [count];
				
		// Make an array of customers
		String[] arrayOfCustomers = new String [numberOfCustomers];
		

				
		for (int n = 0; n < arrayOfCustomers.length; n++) {
			spent = 0;
	//	System.out.println("First name");
			firstName = scan.next();
			//System.out.println("Last name");
			lastName = scan.next();
			arrayOfCustomers[n] = firstName + " " + lastName;
	//	System.out.println("Number of items bought by that customer");
			itemsBought = scan.nextInt();
			String[] itemsBoughtByIndividual = new String[itemsBought];
					
			for (int a = 0; a < itemsBought; a++) {
				
				counterVariable = 0;
	//		System.out.println("Quantity Bought");
				quantityBought = scan.nextInt();
		//	System.out.println("Name of that item");
				nameOfItem = scan.next();
				itemsBoughtByIndividual[a] = nameOfItem;
				while (counterVariable < itemsInStore.length) {
				if (itemsBoughtByIndividual[a].equals(itemsInStore[counterVariable])) {
					itemCounter[counterVariable] += quantityBought;
					counterVariable = itemsInStore.length;
					
					}
				counterVariable++;
				}
				
				}
			
			Arrays.sort(itemsBoughtByIndividual);
			for (int i = 0; i < itemsBought; i++) {
				newCounterVariable = 0;
				while(newCounterVariable < itemsInStore.length) {
					if(i!=itemsBoughtByIndividual.length - 1 && itemsBoughtByIndividual[i].equals(itemsInStore[newCounterVariable]) && !itemsBoughtByIndividual[i].equals(itemsBoughtByIndividual[i+1])) {
						customerCounter[newCounterVariable] += 1;
						newCounterVariable = itemsInStore.length; 
						} else if (i == itemsBoughtByIndividual.length - 1 && itemsBoughtByIndividual[i].equals(itemsInStore[newCounterVariable]) ) {
							customerCounter[newCounterVariable] ++;
							
						} else if (itemsBoughtByIndividual.length == 1 && itemsBoughtByIndividual[i].equals(itemsInStore[newCounterVariable])) {
							customerCounter[newCounterVariable] +=1;
						}
						else {
						} newCounterVariable ++;
					}
				
				}
			}
			
			
			

		for (int i = 0; i < itemCounter.length; i++) {
			if(itemCounter[i] == 0) {
				System.out.println("No customers bought" + " " + itemsInStore[i]);
			} else {
				System.out.println(customerCounter[i] + " " + "customers bought" + " " + itemCounter[i] + " " + itemsInStore[i]);
			}
		}
	}
}
