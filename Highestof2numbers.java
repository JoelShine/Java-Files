
import java.util.*;
public class Highestof2numbers
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input two numbers to get the highest of the two values .....");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double ansmax=Math.max(a,b); 
        double ansmin=Math.min(a,b); 
        System.out.println("The highest number of these two numbers = "+ansmax);
        System.out.println("                   ");
        System.out.println("Thus, we can say "+ansmax+" > "+ansmin);
    }
}
