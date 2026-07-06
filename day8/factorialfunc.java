package day8;
import java.util.Scanner;
public class factorialfunc {
     public static void main(String[] args)
     {
    	 int a=factorial();
    	 System.out.println(a);
     }
     static int factorial()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("number:");
    	 int n=sc.nextInt();
    	 int fact=1;
    	 for(int i=1;i<=n;i++)
    	 {
    		 fact+=i;
    	 }
    	 return fact;
     }
}
