package Set3;

import java.util.Scanner;

public class problem9_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Working hours of each day from Saturday to Tuesday,x = ");
        int x = in.nextInt();
        System.out.print("Working hours of Wednesday,y = ");
        int y = in.nextInt();

        int totalWorkingHour = (4 * x) + y;

        System.out.println("the total number of working hours in one week = " + totalWorkingHour);
    }
}
