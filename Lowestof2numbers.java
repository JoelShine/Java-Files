
import java.util.*;
public class Lowestof2numbers
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input two numbers to get the lowest of the two values .....");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double ansmax=Math.max(a,b); 
        double ansmin=Math.min(a,b); 
        System.out.println("The lowest number of these two numbers = "+ansmin);
        System.out.println("                   ");
        System.out.println("Thus, we can say "+ansmin+" < "+ansmax);
    }
}
