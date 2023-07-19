/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionone;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class QuestionOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student's full name
        System.out.print("Enter student's full name: ");
        String fullName = scanner.nextLine();

        // Initialize arrays to store subject names and marks
        String[] subjects = new String[5];
        double[] marks = new double[5];

        // Get subject names and marks from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = scanner.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = Double.parseDouble(scanner.nextLine());
        }

        // Display the student's name, subjects, marks, and grades
        System.out.println("\nStudent Name: " + fullName);
        System.out.println("Subjects\tMarks\tGrade");
        for (int i = 0; i < 5; i++) {
            String grade = calculateGrade(marks[i]);
            System.out.println(subjects[i] + "\t\t" + marks[i] + "\t" + grade);
        }

        scanner.close();
    }

    // Helper method to calculate the grade based on marks
    private static String calculateGrade(double marks) {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else if (marks >= 30) {
            return "E";
        } else {
            return "F";
        }
    }
}

