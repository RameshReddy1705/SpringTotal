/*	1
 * 	2	6
 * 	3	7	10
 * 	4	8	11	13
 * 	5	9	12	14	15
 */

import java.util.Scanner;
public class Pattern_6
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			int x=i,k=n-1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x=x+k;
				k--;
			}
			System.out.println();
		}
	}
}
