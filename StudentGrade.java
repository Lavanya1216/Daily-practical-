package method;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
        
        // Prompting the user to enter marks for three subjects
        System.out.println("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt(); // Reading marks for Subject 1
        
        System.out.println("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt(); // Reading marks for Subject 2
        
        System.out.println("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt(); // Reading marks for Subject 3
        
        // Calculating total marks
        int totalMarks = subject1 + subject2 + subject3;
        
        // Displaying total marks
        System.out.println("Total marks: " + totalMarks);
        
        // Determining grade based on total marks using a single switch-case
        char grade;
        switch (totalMarks / 30) {
            case 9:
                grade = 'A'; // Grade A for total marks 90-100
                break;
            case 8:
                grade = 'B'; // Grade B for total marks 80-89
                break;
            case 7:
                grade = 'C'; // Grade C for total marks 70-79
                break;
            case 6:
                grade = 'D'; // Grade D for total marks 60-69
                break;
            default:
                grade = 'F'; // Grade F for total marks below 60
        }
        
        // Displaying grade
        System.out.println("Grade: " + grade);
    }
}

/*
 Output:
 1)
    Enter marks for Subject 1: 
    50
    Enter marks for Subject 2: 
    60
    Enter marks for Subject 3: 
    70
    Total marks: 180
    Grade: D
2)
    Enter marks for Subject 1: 
    90
    Enter marks for Subject 2: 
    90
    Enter marks for Subject 3: 
    90
    Total marks: 270
    Grade: A
 */
