/*
 * Programmer: David Pavel
 * Date: Friday, September 25, 2020
 * Purpose: To print out movie tickets
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        
    	// Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for the side lengths
        System.err.print("How old are you? ");
        int age = input.nextInt();
        double originalCost = 14.5;

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean hasCoupon = input.nextBoolean();
       
        // Read in a true/false value
        if (age < 13 || age >= 65) {
        	System.out.println("Your ticket costs $11.5.");}
        	else {
        		System.out.println("Your ticket costs $14.5.");
        	}
        	
        if (hasCoupon == true) {
        	double newCost = originalCost - 2;
        	System.out.println("Your ticket costs " + newCost);
         	}
        else {
        	System.out.println("Your ticket costs $14.5.");
        }
     
       
        
       // Print the cost of a movie ticket
       
        // Figure out the cost and print it
    }
}
