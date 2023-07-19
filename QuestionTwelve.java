/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questiontwelve;

/**
 *
 * @author hp
 */
public class QuestionTwelve {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (num <= 50) {
            // Check if the number is odd
            if (num % 2 != 0) {
                sum += num;
            }
            num++;
        }

        System.out.println("Sum of odd numbers from 1 to 50: " + sum);
    }
}
