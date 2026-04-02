
package Set3;
import java.util.Scanner;
public class problem14_Set3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter profit of Company A,p = ");
        int p=in.nextInt();
        System.out.print("Enter profit of Company B,q = ");
        int q=in.nextInt();
        System.out.print("Enter profit of Company C,r = ");
        int r=in.nextInt();
        System.out.print("Enter profit of Company D,s = ");
        int s=in.nextInt();
        
        if(p>(q+r+s)||q>(p+r+s)||r>(p+q+s)||s>(p+q+r))
        {
            System.out.println("There is a monopoly.");
        }
        else
        {
            System.out.println("There is no monopoly.");
        }
    }
    
}
