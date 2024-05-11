package arrays_Pro;

import java.util.Arrays;

public class MergingTwoArrays_10
{
	public static void main(String[] args)
	{
		ArraysOperation ao=new ArraysOperation();
		System.out.println("Read first Array");
		int x[] = ao.readArray();
		System.out.println("Read first Array");
		int y[]= ao.readArray();
		System.out.println("Merging");
		int z[]=ao.merge(x,y);
		System.out.println(Arrays.toString(z));
		System.out.println("sorting");
		Arrays.sort(z);
		for (int i = 0; i < z.length; i++)
		{
			System.out.println(z[i]);
		}
		
	}

}
