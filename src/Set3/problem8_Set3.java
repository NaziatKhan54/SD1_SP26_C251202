package Set3;

import java.util.Scanner;

public class problem8_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of sections,x = ");
        int x = in.nextInt();
        System.out.print("Number of students in each section,y = ");
        int y = in.nextInt();
        int n = x * y;
        System.out.println("total number of students,n = " + n);
        System.out.print("number of students passed,z = ");
        int z = in.nextInt();
        double percent = (((double) z / n) * 100);
        if (percent > 50) {
            System.out.println("The number of students who passed was strictly greater than 50%");
        } else {
            System.out.println("The number of students who passed was smaller than 50%");
        }
    }
}
