
package Set1;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter n = ");

        int n = myObject.nextInt();
        int i,sum=0;
        for (i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.print("Sum of all numbers = "+sum+"\n");
    
}
}
