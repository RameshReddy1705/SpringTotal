/*
 * WAJP to print the Reverse the array in Reverse order??
 */
import java.util.Scanner;
public class Reverse_Array_2
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
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
}
