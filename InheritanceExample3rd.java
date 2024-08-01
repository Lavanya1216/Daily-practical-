package method;

/*
Create a class Person with fields name and age and a parameterized constructor to initialize them. 
Then, create a subclass Employee that inherits from Person and has an additional field employeeId.
Write constructors for the Employee class 
that initialize its fields and invoke the constructor of the Person class.
*/
//Superclass Person
class Person {
   String name;
   int age;

   // Parameterized constructor to initialize name and age
   Person(String name, int age) {
       this.name = name;
       this.age = age;
   }
}

//Subclass Employee that inherits from Person
class Employee extends Person {
   int employeeId;

   // Constructor to initialize all fields, invoking the Person constructor
   Employee(String name, int age, int employeeId) {
       super(name, age); // Call to the superclass constructor
       this.employeeId = employeeId;
   }

   // Displaying the details
   void display()
   {
       System.out.print("Name: "+name+" Age: "+ age+" EmployeeId: "+employeeId);
   }
}

public class InheritanceExample3rd {
   public static void main(String[] args) {
       // Creating an instance of Employee
       Employee employee = new Employee("Fatima", 21, 77982);
       // Printing the Employee details
       employee.display();
   }
}

/*
Output:
Name: Fatima Age: 21 EmployeeId: 77982
*/
