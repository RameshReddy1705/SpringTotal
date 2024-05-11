import java.util.Scanner;
public class SmallestElement_Arrays_6
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
		int small=smallestElement(ar);
		
		System.out.println(small);
		
	}
	static int smallestElement(int []x)
	{
		int small=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<small)
			{
				small=x[i];
			}
			
		}
		return small;
	}
}
