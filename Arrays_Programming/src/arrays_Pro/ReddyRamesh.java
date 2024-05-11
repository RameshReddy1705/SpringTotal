package arrays_Pro;

import java.util.Scanner;

public class ReddyRamesh
{
	public int[] firstArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n value");

		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public void visible(int[] rr)
	{
		for(int i=0;i<rr.length;i++)
		{
			System.out.print(rr[i]);
		}
	}
	

	public int[] insertArray(int[]d, int ele,int in)
	{
		if(in<0||in>d.length)
		{
			System.out.println("not in range");
			return d;
		}
		
		int[] br=new int[d.length+1];
		br[in]=ele;
		for(int i=0;i<d.length;i++)
		{
			if(i<in)
			{
				br[i]=d[i];
			}
			else
			{
				br[i+1]=d[i];
			}
	
		}
		return br;
	}
	public int[] deleteArray(int[] h,int inc)
	{
		if(inc<0||inc>=h.length)
		{
			System.err.println("Not in range");
			return h;
		}
		int[] cr=new int[h.length-1];
		for(int i=0;i<cr.length;i++)
		{
			
			if(i<inc)
			{
				cr[i]=h[i];
			}
			else
			{
				cr[i]=h[i+1];
			}
		}
		return cr;
	}
}

















