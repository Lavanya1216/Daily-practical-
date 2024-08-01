package method;

import java.util.Scanner;

	public class OddEvenCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
	        int oddCount = 0; // Variable to store the count of odd numbers
	        int evenCount = 0; // Variable to store the count of even numbers

	        while (true) { // Infinite loop, will break when user enters -1
	            System.out.print("Enter a number (-1 to stop): "); // Prompt the user to enter a number
	            int number = scanner.nextInt(); // Read the integer entered by the user

	            if (number == -1) { // Check if the entered number is -1, if so, exit the loop
	                break;
	            } else if (number % 2 == 0) { // Check if the entered number is even (divisible by 2)
	                evenCount++; // Increment the count of even numbers
	            } else { // If the entered number is not -1 and not even, it must be odd
	                oddCount++; // Increment the count of odd numbers
	            }
	        }

	        // Display the total count of odd and even numbers entered by the user
	        System.out.println("Total odd numbers: " + oddCount);
	        System.out.println("Total even numbers: " + evenCount);

	        scanner.close(); // Close the Scanner object to prevent resource leak
	    }
	}

