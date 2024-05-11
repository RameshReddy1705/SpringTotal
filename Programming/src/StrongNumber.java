//Strong Number?????????????
import java.util.Scanner;
public class StrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		boolean rs=isStrongNumber(i);

		if(rs==true)
		{
			System.out.println("Strong"+i);
			System.out.println("Ramesh");
		}
		else
		{
			System.err.println("Reddy");
		}
		}
	}
	static boolean isStrongNumber(int a)
	{
		int sum=0,temp=a;
		do
		{
			int r=a%10;
			sum=sum+fact(r);
			a=a/10;
		}while(a!=0);
		if(sum==temp)
		return true;
		else
			return false;
	}
	static int fact(int r)
	{
		int fact=1;
		while(r!=0)
		{
			fact=fact*r;
			r--;
		}
		return fact;
	}
}







