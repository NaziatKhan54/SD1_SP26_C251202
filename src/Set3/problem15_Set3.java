
package Set3;

import java.util.Scanner;

public class problem15_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B, C;
        System.out.print("Alice's required temperature A: ");
        A = in.nextInt();
        System.out.print("Bob's required temperature B: ");
        B = in.nextInt();
        System.out.print("Charlie's required temperature C: ");
        C = in.nextInt();
        if (Math.max(A, C) <= B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
