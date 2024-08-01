/*Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. 
 * ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound."
 *  ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively. 
 *  ● The program should allow the user to create and display objects of each class.
 */

package method;

//Superclass Animal with a method makeSound()
class Animal {
 // Method to make a sound
 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog that overrides makeSound()
class Dog extends Animal {
 // Override makeSound() to print "The dog barks"
 @Override
 void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat that overrides makeSound()
class Cat extends Animal {
 // Override makeSound() to print "The cat meows"
 @Override
 void makeSound() {
     System.out.println("The cat meows.");
 }
}

public class AnimalSounds {
 public static void main(String[] args) {
     // Create an Animal object
     Animal animal = new Animal();
     System.out.println("Animal:");
     animal.makeSound();

     // Create a Dog object
     Dog dog = new Dog();
     System.out.println("\nDog:");
     dog.makeSound();

     // Create a Cat object
     Cat cat = new Cat();
     System.out.println("\nCat:");
     cat.makeSound();
 }
}
/*Output:
 * Animal:
The animal makes a sound.

Dog:
The dog barks.

Cat:
The cat meows*/
