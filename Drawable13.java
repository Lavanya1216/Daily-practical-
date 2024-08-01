package method;
//Drawable.java
interface Drawable {
 void draw();
}

//Circle.java
class Circle implements Drawable {
 @Override
 public void draw() {
     System.out.println("Drawing a Circle.");
 }
}

//Rectangle.java
class Rectangle implements Drawable {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle.");
 }
}

//Triangle.java
class Triangle implements Drawable {
 @Override
 public void draw() {
     System.out.println("Drawing a Triangle.");
 }
}

//Main.java
public class Drawable13 {
 public static void main(String[] args) {
     Drawable circle = new Circle();
     Drawable rectangle = new Rectangle();
     Drawable triangle = new Triangle();

     circle.draw();
     rectangle.draw();
     triangle.draw();
 }
}
