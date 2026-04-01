
package Set2;
import java.util.Scanner;
public class problem4_Set2 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the size of the array = ");
        int n= input.nextInt();
        System.out.print("Enter the elements = ");
        int[] arr= new int[n];
        int i;
        
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("The average of an array = "+(double)sum/n+"\n");
        
    }
    
    
}
