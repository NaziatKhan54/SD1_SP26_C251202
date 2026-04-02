package Set3;

import java.util.Scanner;

public class problem2_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String out = in.nextLine();
        System.out.print("The string will be = ");
        int lastIndex = out.length() - 1;
        if (out.length() > 10) {
            System.out.print(out.charAt(0));
            System.out.print(out.length() - 2);
            System.out.println(out.charAt(lastIndex));
        } else {
            System.out.println(out);
        }
    }
}
