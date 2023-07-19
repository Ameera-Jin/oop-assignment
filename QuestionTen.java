/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionten;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;

        do {
            System.out.print("Enter an integer (enter 0 to stop): ");
            num = scanner.nextInt();

            sum += num;
        } while (num != 0);

        System.out.println("Sum of entered integers: " + sum);

        scanner.close();
    }
}
