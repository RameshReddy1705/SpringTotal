/*	5
 * 	4	5
 * 	3	4	5
 * 	2	3	4	5
 * 	1	2	3	4	5
 */

import java.util.Scanner;
public class Pattern_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
