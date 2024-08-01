package method;
import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Declare a variable to store the user input number
        int number;
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        
        // Initialize a variable to store the sum of divisors
        int sumOfDivisors = 0;
        
        // Iterate through all possible divisors from 1 to number/2
        for (int i = 1; i <= number / 2; i++) {
            // Check if 'i' is a divisor of 'number'
            if (number % i == 0) {
                // Add the divisor to the sum
                sumOfDivisors += i;
            }
        }
        
        // Check if the sum of divisors is equal to the original number
        if (number == sumOfDivisors) {
            // Print that the number is a perfect number
            System.out.println("Perfect number");
        } else {
            // Print that the number is not a perfect number
            System.out.println("Not a perfect number");
        }
    }
}

//Output:
	 Enter the number:12
	 Not an perfect number
	 Engter the number:6
	 Perfect number
	 */