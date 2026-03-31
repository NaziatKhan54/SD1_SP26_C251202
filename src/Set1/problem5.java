package Set1;

import java.util.Scanner;

public class problem5 {

    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter two numbers = ");
        int num1 = myObject.nextInt();
        int num2 = myObject.nextInt();

        System.out.print("Select Operator = ");
        char operator = myObject.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        if (operator == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        if (operator == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        if (operator == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }

    }

}
