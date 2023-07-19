/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionfour;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int max;

        switch (num1 > num2 ? 1 : num1 < num2 ? 2 : 0) {
            case 1:
                max = num1;
                break;
            case 2:
                max = num2;
                break;
            default:
                System.out.println("Both numbers are equal.");
                scanner.close();
                return;
        }

        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}
