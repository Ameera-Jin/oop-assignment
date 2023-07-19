/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questiontwo;

/**
 *
 * @author hp
 */
public class QuestionTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Labeled Break Statement
        System.out.println("Labeled Break:");
        labeledBreakDemo();

        System.out.println("\n--------------------------\n");

        // Unlabeled Break Statement
        System.out.println("Unlabeled Break:");
        unlabeledBreakDemo();
    }

    public static void labeledBreakDemo() {
        // Labeled break statement to exit the outer loop
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Labeled break: Exiting outer loop");
                    break outerLoop;
                }
            }
        }
    }

    public static void unlabeledBreakDemo() {
        // Unlabeled break statement to exit the innermost loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Unlabeled break: Exiting innermost loop");
                    break;
                }
            }
        }
    }
}

