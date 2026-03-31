package Set1;

import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter three numbers = ");

        int num1 = myObject.nextInt();
        int num2 = myObject.nextInt();
        int num3 = myObject.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest");
        }

    }

}
