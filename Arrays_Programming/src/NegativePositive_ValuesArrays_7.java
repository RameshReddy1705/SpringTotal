import java.util.Scanner;

public class NegativePositive_ValuesArrays_7
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
		
		numberNegativePositive(ar);
		
	}
	static void numberNegativePositive(int []x)
	{
		int negativeCount=0,positiveCount=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<0)
			{
				negativeCount++;
			}
			else
			{
				positiveCount++;
			}
		}
		System.out.println(positiveCount+"negativeCount ");
		System.out.println(negativeCount+"positiveCount");
		int s[]= {negativeCount,positiveCount};
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
