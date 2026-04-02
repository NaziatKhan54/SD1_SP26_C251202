package Set3;

import java.util.Scanner;

public class problem4_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A,B,C = ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == b) {
            System.out.println("Value that occured once is " + c);
        } else if (b == c) {
            System.out.println("Value that occured once is " + a);
        } else {
            System.out.println("Value that occured once is " + b);
        }
    }
}
