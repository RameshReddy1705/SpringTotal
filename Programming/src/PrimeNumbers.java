//Print all prime numbers form n?
import java.util.Scanner;
public class PrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		for(int i=n;i<=m;i++)
		{
			
		boolean rs=isPrimeNumber(i);
		if(rs==true)
		{
			count++;
			System.out.println(count+"  count");
			System.out.println("Prime Number :"+i);
		}
		else
		{
			System.err.println("not Prime Number :"+i);
		}
		
		}
	}
	static boolean isPrimeNumber(int a)
	{
		for(int i=2;i<=a/2;i=i+1)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
