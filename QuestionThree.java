/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionthree;

/**
 *
 * @author hp
 */
public class QuestionThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*IF-ELSE Statement
        It is used to create conditional branches in the code. 
         It allows you to execute different blocks of code based on a certain condition. 
         If the condition specified in the if block evaluates to true, the code inside the if block is executed; 
         otherwise, if the condition evaluates to false, the code inside the else block is executed. Example*/
        int num = -2;
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negetive.");}
        /*Switch statements
        he switch statement is used when you have multiple possible values for a variable 
         and want to execute different code blocks for each value. 
        It provides an organized way to handle multiple cases without using multiple if-else statements.
        The switch statement evaluates an expression and compares it with various case labels. 
        If the expression matches any of the case labels, the corresponding code block is executed. 
        If none of the case labels matches the expression, the code inside the default block (optional) is executed.

Example:*/
        int dayOfWeek = 2;
switch (dayOfWeek) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}

    }    
}
