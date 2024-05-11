//HappyNumber

import java.util.Scanner;
public class HappyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		boolean Ramesh=isHappyNumber(n);
		if(Ramesh)
		{
			System.out.println("Ramesh");
		}
		else
		{
			System.err.println("Reddy");
		}
	}

	static boolean isHappyNumber(int n)
	{

		while(n>9)
		{
			int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*r;
			n=n/10;
		}
		n=sum;
		}
		return n==1||n==7;
		
	}

}
