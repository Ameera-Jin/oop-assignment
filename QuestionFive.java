/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionfive;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full name of the student: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        String grade;

        if (score >= 70) {
            grade = "A";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else if (score >= 40) {
            grade = "D";
        } else if (score >= 0 && score < 40) {
            grade = "F";
        } else {
            System.out.println("Invalid score.");
            scanner.close();
            return;
        }

        System.out.println("Student: " + fullName);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
