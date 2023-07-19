/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionnine;

/**
 *
 * @author hp
 */
public class QuestionNine {
    public static void main(String[] args) {
        int sum = 0;
        int num = 20;

        do {
            sum += num;
            num++;
        } while (num <= 25);

        System.out.println("Sum of numbers between 20 and 25: " + sum);
    }
}
