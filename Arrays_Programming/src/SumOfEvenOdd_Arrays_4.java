import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenOdd_Arrays_4
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
		
		int[] sum=sumElement(ar);
		/*for(int i=0;i<sum.length;i++)
		{
			System.out.println(sum[i]);
		}*/
		System.out.println(Arrays.toString(sum));
	}
	static int[] sumElement(int[]x)
	{
		int evenSum=0,oddSum=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				evenSum=evenSum+x[i];
			}
			else
			{
				oddSum=oddSum+x[i];
			}
		}
		int sr[]= {evenSum,oddSum};
		return sr;
	}
}
