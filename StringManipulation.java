/*Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is

"12345678", the return value should be "XXXX5678".*/

package method;

public class StringManipulation {
    public static void main(String[] args) {
        String original = "12345678";
        String result = maskString(original);
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + result);
    }

    public static String maskString(String input) {
        int length = input.length();
        int startIndex = Math.max(0, length - 4); // Start index for last 4 characters

        // Create a char array with 'X' characters
        char[] maskedChars = new char[length];
        for (int i = 0; i < startIndex; i++) {
            maskedChars[i] = 'X';
        }

        // Copy the last 4 characters from the original string
        for (int i = startIndex; i < length; i++) {
            maskedChars[i] = input.charAt(i);
        }

        // Convert char array to String
        return new String(maskedChars);
    }
}
/*Original String: 12345678
Modified String: XXXX5678
*/