// Write a program to Convert String to Character Array.



package method;

public class StringToCharArray {

    public static void main(String[] args) {
        String str = "hello world";
        
        // Convert string to character array
        char[] charArray = str.toCharArray();
        
        // Print each character in the array
        System.out.println("String: " + str);
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println(); // Print new line
    }
}
/*Output:
String: hello world
Character Array: h e l l o   w o r l d*/