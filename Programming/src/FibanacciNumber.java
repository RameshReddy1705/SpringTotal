import java.util.Scanner;

public class FibanacciNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=0;
		int f2=1;
		int f3=0;
		System.out.println(f1);
		System.out.println(f2);
		while(n>0)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			n--;
		}
		
	}

}
