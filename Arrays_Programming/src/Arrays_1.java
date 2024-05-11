/*
 * WAJP to print user enter array???
 */

import java.util.Scanner;
public class Arrays_1
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
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}

}
