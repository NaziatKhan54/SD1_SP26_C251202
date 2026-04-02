package Set3;

import java.util.Scanner;

public class problem7_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Assignment starting time = ");
        int startingTime = in.nextInt();
        if (startingTime + 3 <= 10) {
            System.out.println("Can complete all assignments on time");
        } else {
            System.out.println("Can't complete all assignments on time");
        }
    }
}
