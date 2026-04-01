package Set2;

import java.util.Scanner;

public class problem5_Set2 {

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
        int countOdd = 0, countEven = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.print("The number of Even numbers is = " + countEven + "\n");
        System.out.print("The number of Odd numbers is = " + countOdd + "\n");
    }
}
