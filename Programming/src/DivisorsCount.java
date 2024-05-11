////count all the diviosrs??and sum of divisors??
import java.util.Scanner;
public class DivisorsCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int count=0;
		int sum=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				sum=sum+i;
				System.out.println(sum);
				//System.out.println(n%i);
			}
			
		}
		System.out.println("sum : "+sum);
		System.out.println("count : "+count);
		
	}
}
