package Set2;

import java.util.Scanner;

public class problem1_Set2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Five numbers = ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The numbers are : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
