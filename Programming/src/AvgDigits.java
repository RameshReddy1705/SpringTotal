import java.util.Scanner;

public class AvgDigits
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		
		double avg=avgDigits(x);
		System.out.println(avg);
	}	
	static double avgDigits(int x)
	{
		double sum=0;
		int count=0;
		do {
			int n=x/10;
			count++;
			sum=sum+n;
			x=x/10;
		}while(x!=0);
		return sum/count;
	}
}
