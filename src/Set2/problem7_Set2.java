package Set2;

import java.util.Scanner;

public class problem7_Set2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = input.nextInt();
        System.out.print("Enter the elements = ");
        int[] arr = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int temp;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("After sorting the elements = ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
