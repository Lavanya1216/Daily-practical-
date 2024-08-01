package method;

/*
Write a Java program that demonstrates method overloading by creating a class called Calculator. 
● Add three methods called add(). 
● The first add() method should take two int variables as arguments and return their sum as int. 
● The second add() method should take three int variables as arguments and return their sum as int. 
● The third add() method should take two doubles as arguments and return their sum as double. 
● The program should allow the user to display the results of each method
*/
import java.util.Scanner;

//Calculator class definition
class Calculator {
// Method to add two integers
int add(int a, int b) {
   return a + b;
}

// Method to add three integers
int add(int a, int b, int c) {
   return a + b + c;
}

// Method to add two doubles
double add(double a, double b) {
   return a + b;
}
}

public class CalculatorPro {
public static void main(String[] args) {
   // Create a Scanner object to read user input
   Scanner scanner = new Scanner(System.in);

   // Instantiate Calculator object
   Calculator calculator = new Calculator();

   // Prompt the user to input integer values
   System.out.print("Enter two integers (separated by space) for addition: ");
   int int1 = scanner.nextInt();
   int int2 = scanner.nextInt();
   //scanner.nextLine(); // Consume newline

   // Call the first add() method and display the result
   int sumInt = calculator.add(int1, int2);
   System.out.println("Sum of two integers: " + sumInt);

   // Prompt the user to input three integer values
   System.out.print("Enter three integers (separated by space) for addition: ");
   int var1=scanner.nextInt();
   int var2=scanner.nextInt();
   int int3 = scanner.nextInt();
   //scanner.nextLine(); // Consume newline

   // Call the second add() method and display the result
   int sumIntThree = calculator.add(var1, var2, int3);
   System.out.println("Sum of three integers: " + sumIntThree);

   // Prompt the user to input double values
   System.out.print("Enter two doubles (separated by space) for addition: ");
   double double1 = scanner.nextDouble();
   double double2 = scanner.nextDouble();

   // Call the third add() method and display the result
   double sumDouble = calculator.add(double1, double2);
   System.out.println("Sum of two doubles: " + sumDouble);
}
}

/*
Output:
Enter two integers (separated by space) for addition: 10 20
Sum of two integers: 30
Enter three integers (separated by space) for addition: 10 20 70
Sum of three integers: 100
Enter two doubles (separated by space) for addition: 10.0 20.0
Sum of two doubles: 30.0
*/




