package Set1;

import java.util.Scanner;

public class problem7 {

    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter n = ");

        int n = myObject.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }
}
