package Set3;

import java.util.Scanner;

public class problem3_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String out = in.nextLine();
        System.out.print("The string will be = ");

        String result = out.substring(0, 1).toUpperCase() + out.substring(1);

        System.out.println(result);
    }
}
