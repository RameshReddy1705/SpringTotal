//Decimal to Octa??

import java.util.Scanner;
public class DecimalToOctal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		String oct=" ";
		do
		{
			int j=n%8;
			oct=oct+j;
			n=n/8;
		}while(n!=0);
		System.out.println(oct);
	}

}
