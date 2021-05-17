package main;

import java.util.Scanner;

public class Converter {
	
    public static void main(String[] args) {
    	int menuSelection = 0;
    	
    	while (menuSelection != 4) {
    		System.out.println("Please select an option:");
    		System.out.println("1. Cups to Teaspoons");
    		System.out.println("2. Miles to Kilometers");
    		System.out.println("3. US Gallons to Imperial Gallons");
    		System.out.println("4. Quit");
    		Scanner scan = new Scanner(System.in);
    		String line = scan.nextLine();
    		
    		switch(line) {
	            case "1": {
	            	System.out.println("Enter number of Cups to convert to Teaspoons");
	            	scan = new Scanner(System.in);
	                System.out.println((48 * (double) scan.nextDouble()) + " Teaspoons");
	                break;
	            }
	            case "2":{
	            	System.out.println("Enter number of Miles to convert to Kilometers");
	            	scan = new Scanner(System.in);
	                System.out.println((1.60934 * (double) scan.nextDouble()) + " Kilometers");
	                break;
	            }
	            case "3":{
	            	System.out.println("Enter number of US Gallons to convert to Imperial Gallon");
	            	scan = new Scanner(System.in);
	                System.out.println((0.832674 * (double) scan.nextDouble()) + " Imperial Gallons");
	                break;
	            }
	            case "4":{
	            	menuSelection = 4;
	                System.out.println("Goodbye.");
	                break;
	            }
	            default:{
	                System.out.println("That is not a valid selection.");
	            }
    		}
    	}
    }
}
