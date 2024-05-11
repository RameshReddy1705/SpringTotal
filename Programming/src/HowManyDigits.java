import java.util.Scanner;

public class HowManyDigits
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
//		int count=0;
//		do {
//			n=n/10;
//			count++;
//		}while(n!=0);

		int dc=digitCount(n);
		System.out.println(dc);
	}
	static  int digitCount( int n)
	{
		int count=0;
		do {
			n=n/10;
			count++;
		}while(n!=0);
		return count;
	}
}
