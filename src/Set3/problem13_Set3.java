
package Set3;

import java.util.Scanner;

public class problem13_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the topic he got = ");
        char x = in.next().charAt(0);
        if (x == 'A' || x == 'B' || x == 'C') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
