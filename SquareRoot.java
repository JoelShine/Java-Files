
import java.util.*;
public class SquareRoot 
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Input a number for finding it's square root ...");
       double a=sc.nextDouble();
       double ans=Math.sqrt(a);
       System.out.println("Calculating square root .....");
       System.out.println("        ");
       System.out.println("Square Root of two numbers = "+ans);
    }
}
