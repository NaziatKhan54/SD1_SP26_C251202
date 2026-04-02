package Set3;

import java.util.Scanner;

public class problem12_Set3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of children,n = ");
        int n = in.nextInt();
        System.out.print("Already has number of candies,x = ");
        int x = in.nextInt();
        double r = n - x;
        double numCandyPacks = Math.ceil(r / 4);
        System.out.print("the minimum number of candy packets he must buy = " + numCandyPacks + "\n");
    }
}
