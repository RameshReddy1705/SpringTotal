package arrays_Pro;

import java.util.Scanner;

public class RameshReddy
{
	public int[] readArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		int[] mm=new int[n];
		for(int i=0;i<mm.length;i++)
		{
			mm[i]=sc.nextInt();
		}
		return mm;
	}
	
	public void dispaly(int[] y)
	{
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
	public void dipaly(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public int[] zigZag(int[] a,int[] b)
	{
		
		int[] c=new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length&&i<b.length)
		{
			c[k]=a[i];
			k++;
			c[k]=b[i];
			i++;
			k++;
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(i<b.length)
		{
			c[k]=b[i];
			k++;
			i++;
		}
		return c;
	}
}
















