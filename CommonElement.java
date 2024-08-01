//Write a Java program to find common elements between two arrays (string values).


package method;

import java.util.ArrayList;
import java.util.List;

public class CommonElement {

    // Method to find common elements between two arrays
    public static String[] findCommonElements(String[] array1, String[] array2) {
        // List to store common elements
        List<String> commonList = new ArrayList<>();

        // Nested loops to find common elements
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    // Add common element to the list if not already added
                    if (!commonList.contains(array1[i])) {
                        commonList.add(array1[i]);
                    }
                }
            }
        }

        // Convert the list of common elements to an array
        return commonList.toArray(new String[0]);
    }

    // Main method to test the findCommonElements method
    public static void main(String[] args) {
        // Sample arrays of strings
        String[] array1 = {"apple", "orange", "banana", "kiwi"};
        String[] array2 = {"banana", "kiwi", "grape", "apple"};

        // Find common elements
        String[] commonElements = findCommonElements(array1, array2);

        // Print the common elements
        System.out.println("Common elements:");
        for (String element : commonElements) {
            System.out.println(element);
        }
    }
}
/*Common elements:
apple
banana
kiwi
*/
