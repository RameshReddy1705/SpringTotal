import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		
		int rev=0;
		do
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}while(x!=0);
		System.out.println(rev);
	}
}
