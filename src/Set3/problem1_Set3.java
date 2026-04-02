package Set3;

import java.util.Scanner;

public class problem1_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Take two integers A and C = ");
        int a = in.nextInt();
        int c = in.nextInt();
        if ((a + c) % 2 == 0) {
            System.out.println("There exists a B which is a Integer and is the average of A and C ");
        } else {
            System.out.println("There doesn't exist a B which is a Integer and is the average of A and C ");
        }
    }
}
