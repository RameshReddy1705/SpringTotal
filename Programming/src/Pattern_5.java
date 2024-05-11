/*	1
 * 	2	1
 * 	3	2	1
 * 	4	3	2	1
 * 	5	4	3	2	1
 */

import java.util.Scanner;
public class Pattern_5
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
