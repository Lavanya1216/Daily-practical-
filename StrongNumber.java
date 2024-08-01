package method;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number
        int num = sc.nextInt();
        
        // Initialize variables to calculate the sum of factorials of digits
        int fact = 1, sum = 0;
        
        // Make a copy of the input number to manipulate
        int copy = num;
        
        // If the number is 0, the factorial of 0 is 1, add it to the sum
        if (num == 0) {
            sum = sum + fact;
        } else {
            // While there are digits left in the number
            while (copy != 0) {
                fact = 1; // Reset the factorial for the next digit
                
                // Extract the last digit
                int rem = copy % 10;
                
                // Calculate the factorial of the digit
                for (int i = 1; i <= rem; i++) {
                    fact = fact * i;
                }
                
                // Add the factorial to the sum
                sum = sum + fact;
                
                // Remove the last digit
                copy = copy / 10;
            }
        }
        
        // Check if the sum of the factorials of the digits is equal to the original number
        if (sum == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
        
        // Close the scanner
        sc.close();
    }
}

