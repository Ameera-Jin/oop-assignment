/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questioneight;

/**
 *
 * @author hp
 */
public class QuestionEight {
    public static void main(String[] args) {
        int num = 12;

        System.out.println("Even numbers from 12 to 50:");

        do {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 50);

        System.out.println();
    }
}
