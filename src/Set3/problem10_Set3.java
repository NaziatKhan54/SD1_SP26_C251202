package Set3;

import java.util.Scanner;

public class problem10_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter B1 = ");
        int b1 = in.nextInt();
        System.out.print("Enter B2 = ");
        int b2 = in.nextInt();
        System.out.print("Enter B3 = ");
        int b3 = in.nextInt();
        if ((b1 == 0 && b2 == 0) || (b2 == 0 && b3 == 0) || (b3 == 0 && b1 == 0)) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }
    }
}
