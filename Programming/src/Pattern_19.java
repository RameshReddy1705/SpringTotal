/*	-	-	-	-	1
 * 	-	-	-	1	2	1
 * 	-	-	1	2	3	2	1
 * 	-	1	2	3	4	3	2	1
 * 	1	2	3	4	5	4	3	2	1
 */

import java.util.Scanner;
public class Pattern_19
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("-"+" ");
			}
			int x=1;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x+" ");
				if(j<i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	
			
		
	}

}
