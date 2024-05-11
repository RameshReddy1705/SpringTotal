package arrays_Pro;
import java.util.Scanner;
public class ArraysOperation
{

	public int[] readArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println(" Enter "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public int[] merge(int[] a,int[] b)
	{
		int c[] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		
		return c;
		
	}
}
