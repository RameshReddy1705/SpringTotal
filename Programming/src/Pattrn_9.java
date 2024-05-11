/*	1
 * 	2	1
 * 	3	2	1
 * 	4	3	2	1
 * 	5	4	3	2	1
 */

import java.util.Scanner;
public class Pattrn_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
