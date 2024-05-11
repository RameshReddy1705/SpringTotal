package arrays_Pro;

import java.util.Scanner;

public class Insert_Particular_Element_12
{
	public static void main(String[] args)
	{
		ReddyRamesh rg=new ReddyRamesh();
		System.out.println("first array");
		int[] a=rg.firstArray();
		
		rg.visible(a);
		System.out.println("first array visible done");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element value index ");
		int element=sc.nextInt(); //5
		System.out.println("Enter index num");
		int g=sc.nextInt(); //4
		int[] c=rg.insertArray(a,element,g);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		System.out.println("Enter d value index ");
		int d=sc.nextInt();
		int[] n=rg.deleteArray(c,d);
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}
		
		
	}

}
