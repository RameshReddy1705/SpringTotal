import java.util.Scanner;

public class PrimeNumbers_8
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n= sc.nextInt();
		
		int []ar=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int primeCount=0;

		for(int i=0;i<ar.length;i++)
		{
			boolean prime=primeCount(ar[i]);

		
		
		if(prime)
		{
			primeCount++;

		}
		}
		System.out.println("Prime count "+primeCount);

	}
	static boolean primeCount(int x)
	{
			for(int j=2;j<=x/2;j++)
			{
				if(x%j==0)
				{
					return false;
				}
			}
		return true;

	}
}
