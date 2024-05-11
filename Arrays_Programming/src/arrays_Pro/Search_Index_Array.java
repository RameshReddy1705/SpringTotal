package arrays_Pro;

import java.util.Scanner;

public class Search_Index_Array {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		int[] ar=new int[n];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		searchElement(ar,20);
	}
	static void searchElement(int[] br,int ele)
	{
		//int[] cr=new int[br.length];
		for (int i = 0; i < br.length; i++)
		{
			if(br[i]==ele)
			{
				System.out.println(i);
			}
		}
	}
}
