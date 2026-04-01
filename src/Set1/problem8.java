package Set1;

import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = myObject.nextInt();
        System.out.print(n + "! = ");
        int i, fact = 1;
        for (i = n; i >= 1; i--) {
            fact = fact * i;
            if (i != 1) {
                System.out.print(i + " X ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + fact);
    }
}
