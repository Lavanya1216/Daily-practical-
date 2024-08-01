// Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.

import java.util.*;

// Custom exception class for duplicate numbers
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        // Prompt user to enter integers
        System.out.println("Enter a list of integers (enter 'done' to finish):");
        
        // Continuously read input until user enters "done"
        while (true) {
            String input = scanner.nextLine();
            
            // Check if user wants to stop entering numbers
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                // Parse input to integer
                int number = Integer.parseInt(input);
                
                // Check for duplicate before adding to list
                checkDuplicate(numbers, number);
                
                // Add number to list if no exception is thrown
                numbers.add(number);
                
            } catch (NumberFormatException e) {
                // Handle invalid input (non-integer)
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                
            } catch (DuplicateNumberException e) {
                // Handle duplicate number exception
                System.out.println("Duplicate number found. Duplicates are not allowed.");
            }
        }
        
        // Display the list of entered numbers without duplicates
        System.out.println("Entered numbers without duplicates:");
        System.out.println(numbers);
        
        // Close scanner to free resources
        scanner.close();
    }
    
    // Method to check for duplicate numbers in the list
    public static void checkDuplicate(List<Integer> numbers, int number) throws DuplicateNumberException {
        if (numbers.contains(number)) {
            // Throw exception if duplicate number is found
            throw new DuplicateNumberException("Duplicate number found: " + number);
        }
    }
}
/*Enter a list of integers (enter 'done' to finish):
5
10
15
20
10
Duplicate number found. Duplicates are not allowed.
25
done
Entered numbers without duplicates:
[5, 10, 15, 20, 25]*/