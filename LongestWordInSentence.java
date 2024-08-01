
/*Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.

Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN” Sample Output: The longest word: FOOTBALL: The length of the word: 8*/

package method;

 import java.util.Scanner;

public class LongestWordInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the input string into words based on whitespace
        String[] words = input.split("\\s+");

        // Initialize variables to store the longest word and its length
        String longestWord = "";
        int maxLength = 0;

        // Iterate through each word in the array
        for (String word : words) {
            // Remove any non-alphabetic characters from the word
            word = word.replaceAll("[^a-zA-Z]", "");

            // Check if current word is longer than the previously found longest word
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        // Output the longest word and its length
        System.out.println("The longest word: " + longestWord);
        System.out.println("The length of the word: " + maxLength);

        scanner.close();
    }
}
/* Enter a sentence: FOOTBALL
The longest word: FOOTBALL
The length of the word: 8*/