package Set2;

import java.util.Scanner;

public class problem8_Set2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string : ");
        String output = input.nextLine();
        int i, j, f = 1, lastindex;
        lastindex = output.length() - 1;
        for (i = 0, j = lastindex; j >= 0; i++, j--) {
            if (output.charAt(i) != output.charAt(j)) {
                f = 0;
                break;
            }
        }
        if (f == 1) {
            System.out.println("The string is Palindrome.");
        } else {
            System.out.println("The string is  not Palindrome.");
        }
    }
}
