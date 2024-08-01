
//Write a Java Program to count the number of words in a String without using the Predefined method?

package method;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello, how are you doing today?";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;

        for (int i = 0; i <= endOfLine; i++) {
            // If the current character is a letter, set isWord to true
            if (Character.isLetter(str.charAt(i)) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(str.charAt(i)) && isWord) {
                // If the current character is not a letter and isWord was true before, it's the end of a word
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(str.charAt(i)) && i == endOfLine) {
                // If the last character is a letter, count it as a word
                wordCount++;
            }
        }
        return wordCount;
    }
}
//output:Number of words in the string: 6

