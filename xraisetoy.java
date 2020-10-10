

import java.util.*;
public class xraisetoy
{
  public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Java Program to find the answer of a number raised to any other number.");
       System.out.println("        ");
       System.out.println("Input a number for making the base...");
       double b=sc.nextDouble();
       System.out.println("Input a number for making the exponent...");
       double e=sc.nextDouble();
       System.out.println("Calculating the value of "+b+" ^ "+e+"...");
       System.out.println("        ");
       double ans=Math.pow(b,e);
       System.out.println("Answer of "+b+" ^ "+e+" = "+ans);
    }
}
