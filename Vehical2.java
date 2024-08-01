package method;

//Vehicle.java
class Vehicle {
 private String make;
 private String model;
 private int year;
 private String fuelType;

 public Vehicle(String make, String model, int year, String fuelType) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.fuelType = fuelType;
 }

 // Getters and setters

 public String getMake() {
     return make;
 }

 public void setMake(String make) {
     this.make = make;
 }

 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     this.year = year;
 }

 public String getFuelType() {
     return fuelType;
 }

 public void setFuelType(String fuelType) {
     this.fuelType = fuelType;
 }

 // Method for calculating fuel efficiency
 public double calculateFuelEfficiency(double distance, double fuelConsumed) {
     return distance / fuelConsumed;
 }

 // Method for calculating distance traveled
 public double calculateDistance(double time, double speed) {
     return time * speed;
 }

 // Method for getting maximum speed
 public double getMaximumSpeed() {
     return 0; // Default implementation, to be overridden by subclasses
 }
}

//Truck.java
class Truck extends Vehicle {
 private double maxLoadCapacity; // Additional property for Truck

 public Truck(String make, String model, int year, String fuelType, double maxLoadCapacity) {
     super(make, model, year, fuelType);
     this.maxLoadCapacity = maxLoadCapacity;
 }

 // Getter and setter for maxLoadCapacity
 public double getMaxLoadCapacity() {
     return maxLoadCapacity;
 }

 public void setMaxLoadCapacity(double maxLoadCapacity) {
     this.maxLoadCapacity = maxLoadCapacity;
 }

 // Override method for getting maximum speed
 @Override
 public double getMaximumSpeed() {
     return 100; // Example value for maximum speed of a truck
 }
}

//Car.java
class Car extends Vehicle {
 private int numberOfSeats; // Additional property for Car

 public Car(String make, String model, int year, String fuelType, int numberOfSeats) {
     super(make, model, year, fuelType);
     this.numberOfSeats = numberOfSeats;
 }

 // Getter and setter for numberOfSeats
 public int getNumberOfSeats() {
     return numberOfSeats;
 }

 public void setNumberOfSeats(int numberOfSeats) {
     this.numberOfSeats = numberOfSeats;
 }

 // Override method for getting maximum speed
 @Override
 public double getMaximumSpeed() {
     return 180; // Example value for maximum speed of a car
 }
}

//Motorcycle.java
class Motorcycle extends Vehicle {
 private String type; // Additional property for Motorcycle

 public Motorcycle(String make, String model, int year, String fuelType, String type) {
     super(make, model, year, fuelType);
     this.type = type;
 }

 // Getter and setter for type
 public String getType() {
     return type;
 }

 public void setType(String type) {
     this.type = type;
 }

 // Override method for getting maximum speed
 @Override
 public double getMaximumSpeed() {
     return 200; // Example value for maximum speed of a motorcycle
 }
}

//Main.java
public class Vehical2{
 public static void main(String[] args) {
     // Example usage
     Truck truck = new Truck("Ford", "F-150", 2022, "Diesel", 5000);
     Car car = new Car("Toyota", "Camry", 2022, "Gasoline", 5);
     Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2022, "Gasoline", "Sport");

     System.out.println("Truck maximum speed: " + truck.getMaximumSpeed() + " km/h");
     System.out.println("Car maximum speed: " + car.getMaximumSpeed() + " km/h");
     System.out.println("Motorcycle maximum speed: " + motorcycle.getMaximumSpeed() + " km/h");
 }
}