
import java.util.*;
public class Reaminderfordivision
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Input two numbers for finding the reaminder of two numbers.");
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double ans=a/b;
       double rans=Math.IEEEremainder(a,b);
       System.out.println("Calculating remainder.....");
       System.out.println("        ");
       System.out.println("Remainder of two numbers = "+rans);
    }
}
