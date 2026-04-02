package Set3;

import java.util.Scanner;

public class problem6_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total number of friends = ");
        int n = in.nextInt();
        System.out.print("Cost of one subscription = ");
        int x = in.nextInt();
        double subsNum = Math.ceil((double) n / 6);
        double totalCost = subsNum * x;
        System.out.print("the minimum total cost of the group of " + n + " friends is " + totalCost + "\n");
    }
}
