/*
 * Define a method in biggest element in an array??
 */
import java.util.Scanner;
public class BiggestElement_Array_3
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
		int big=biggestElement(ar);
		
		System.out.println(big);
		
	}
	static int biggestElement(int []x)
	{
		int big=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>big)
			{
				big=x[i];
			}
			
		}
		return big;
	}
}
