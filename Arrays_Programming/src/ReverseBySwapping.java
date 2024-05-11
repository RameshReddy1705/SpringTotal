

import java.util.Scanner;
public class ReverseBySwapping
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		reverseBySwapping(ar);
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[j]);

		}
	}

	static void reverseBySwapping(int[] cr)
	{
		int i=0,j=cr.length-1;
		do
		{
			int temp=cr[i];
			cr[i]=cr[j];
			cr[j]=temp;
			i++;
			j--;
		}while(i<j);
	}

}
