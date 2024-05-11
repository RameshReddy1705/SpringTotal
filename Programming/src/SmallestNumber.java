import java.util.Scanner;

public class SmallestNumber
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int small=a;
		if(b<small)
		{
			small=b;
		}
		if(c<small)
		{
			small=c;
		}
		if(d<small)
		{
			small=d;
		}
		System.out.println(small+" Smallest Number");

	}

}
