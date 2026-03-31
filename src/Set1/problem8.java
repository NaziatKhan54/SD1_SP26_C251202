package Set1;

import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter n = ");

        int n = myObject.nextInt();
        int i, fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(n + "! = " + fact);

    }
}
