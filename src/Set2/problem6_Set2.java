package Set2;

import java.util.Scanner;

public class problem6_Set2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = input.nextInt();
        System.out.print("Enter the elements = ");
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Search an Item = ");
        int item = input.nextInt();
        int count = 0;
        for (i = 0; i < n; i++) {
            if (item == arr[i]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found");
        }
    }
}
