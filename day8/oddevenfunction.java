package day8;
import java.util.Scanner;
public class oddevenfunction {
	public static void main(String[] args)
	{
		countoddeven();
	}
	static void countoddeven() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int odd=0,even=0;
		while(a!=0)
		{
			int num=a%10;
			if(num%2==0)
		      even++;
			else
				odd++;
			a=a/10;
		}
		System.out.println("even digits= "+even);
		System.out.println("odd digits= "+odd);

	}
   
}
