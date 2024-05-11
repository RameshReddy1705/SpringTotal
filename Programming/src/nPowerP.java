//n^p values

import java.util.Scanner;
public class nPowerP
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int p= sc.nextInt();
		
		int prod=1;
		while(p>=1)
		{
			prod =prod*n;
			p--;
		}
		System.out.println(prod);
	}

}
