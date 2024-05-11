import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//int n= sc.nextInt();
		int count=0;
		int notcount=0;

		for(int i=100;i<=999;i++)
		{
			boolean rs=isPalindrome(i);

		
		if(rs)
		{
			count++;
			System.out.println(count);

			System.out.println("Palindrome"+i);
		}
		else
		{
			notcount++;
			System.out.println(notcount);
			System.out.println("not Palindrome");
		}
		}
	}
	static boolean isPalindrome(int x)
	{
		int rev=0;
		int temp=x;
		for(int i=0;i<=x;i++)
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		return rev==temp;
	}
}















