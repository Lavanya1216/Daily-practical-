
/* Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd. */

// Java program to demonstrate throwing an exception if the number is odd

// Custom exception class for odd numbers
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class Main {
    // Method to check if a number is even and throw an exception if it's odd
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is odd: " + number);
        } else {
            System.out.println(number + " is even.");
        }
    }

    public static void main(String[] args) {
        try {
            // Test the checkEvenNumber method with different inputs
            checkEvenNumber(2);   // Even number
            checkEvenNumber(7);   // Odd number (throws exception)
            checkEvenNumber(10);  // Even number
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
/* Output
2 is even.
Exception caught: Number is odd: 7
*/