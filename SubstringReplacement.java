//Write a program replace a Substring in a String.
package method;

public class SubstringReplacement {

    public static void main(String[] args) {
        String originalString = "hello world";
        String substringToReplace = "world";
        String replacement = "Java";
        
        String modifiedString = replaceSubstring(originalString, substringToReplace, replacement);
        
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceSubstring(String originalString, String substringToReplace, String replacement) {
        // Check if the substring to replace exists in the original string
        if (!originalString.contains(substringToReplace)) {
            System.out.println("Substring to replace not found in the original string.");
            return originalString;
        }
        
        // Perform the replacement using String's replace method
        String modifiedString = originalString.replace(substringToReplace, replacement);
        
        return modifiedString;
    }
}
/*Output:
Original String: hello world
Modified String: hello Java*/