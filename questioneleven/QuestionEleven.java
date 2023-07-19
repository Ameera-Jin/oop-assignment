/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questioneleven;

/**
 *
 * @author hp
 */
public class QuestionEleven {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 0 to 100:");

        int number = 0;
        while (number <= 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
