
package Set1;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);
        
        System.out.println("Enter a number = ");
        
        int num=myObject.nextInt();
        
        if(num%2==0)
        {
            System.out.println("Even Number");
        }
        
        else 
        {
            System.out.println("Odd Number");
        }

    }
}
