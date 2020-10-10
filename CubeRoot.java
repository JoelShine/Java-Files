
import java.util.*;
public class CubeRoot
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Input a number for finding it's cube root ...");
       double a=sc.nextDouble();
       double ans=Math.cbrt(a);
       System.out.println("Calculating cube root .....");
       System.out.println("        ");
       System.out.println("Cube Root of two numbers = "+ans);
    }
}
