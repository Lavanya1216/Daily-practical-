package method;

//BasicAnimal.java
interface BasicAnimal {
 void eat();
 void sleep();
}

//Monkey.java
class Monkey {
 public void jump() {
     System.out.println("Monkey is jumping.");
 }

 public void bite() {
     System.out.println("Monkey is biting.");
 }
}

//Human.java
class Human extends Monkey implements BasicAnimal {
 @Override
 public void eat() {
     System.out.println("Human is eating.");
 }

 @Override
 public void sleep() {
     System.out.println("Human is sleeping.");
 }
}

//Main.java
public class AnimalBasic {
 public static void main(String[] args) {
     Human human = new Human();

     // Using methods from Monkey class
     human.jump();
     human.bite();

     // Using methods from BasicAnimal interface
     human.eat();
     human.sleep();
 }
}
