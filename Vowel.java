//How do you count a number of vowels and consonants in a given string?


package method;

public class Vowel {
    public static void main(String[] args) {
        String str = "Hello World";
        countVowelsAndConsonants(str);
    }

    public static void countVowelsAndConsonants(String str) {
        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Print the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
/* Output:
 Number of vowels: 3
Number of consonants: 7

 */
 