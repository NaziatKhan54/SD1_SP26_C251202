package Set2;

import java.util.Scanner;

public class problem2_Set2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = input.nextInt();
        System.out.print("Enter elements = ");
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print("The largest element is = " + max + "\n");
    }
}
