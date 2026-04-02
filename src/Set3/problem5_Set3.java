package Set3;

import java.util.Scanner;

public class problem5_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A,B,C = ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (((double) (a + b) / 2) > c) {
            System.out.println("the average of A and B is strictly greater than C");
        } else {
            System.out.println("the average of A and B is smaller than C");
        }
    }
}
