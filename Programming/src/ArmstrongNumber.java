import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		//int x= sc.nextInt();
		int count=0;
		int notcount=0;
		for(int i=100;i<=999;i++)
		{
			boolean rs=isArmstrongNumber(i);
	
		if(rs)
		{
			count++;
			System.out.println("count : "+count);
			System.out.println("Armstrong : "+i);
		}
		else
		{
			notcount++;
			System.out.println("notcount : "+notcount);
			System.out.println("Not");
		}
		}
	}
	static boolean isArmstrongNumber(int n)
	{
		int sum=0,temp=n;
		int dc=digitCount(n);
		while(n!=0)
		{
		int d=n%10;
		sum=sum+pow(d,dc);
		n=n/10;
		}
		return sum==temp;
	}
	static int pow(int n, int p)
	{
		int prod=1;
		while(p>=1)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}
	static int digitCount(int dc)
	{
		int count=0;
		do
		{
			dc=dc/10;
			count++;
		}while(dc!=0);
		return count;
	}
}












