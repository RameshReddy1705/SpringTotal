import java.util.Scanner;

public class DateValidOrNot
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int dd= sc.nextInt();
		int mm= sc.nextInt();
		int yy= sc.nextInt();
		
		if(mm<1||mm>12||dd<1||dd>31||yy<1)
		{
			System.out.println("Invild");
		}
		else if(mm==4||mm==6||mm==9||mm==11&&dd>30)
		{
			System.out.println("Invalid");
		}
		else if(mm==2&&dd>29)
		{
			System.out.println("invalid");
		}
		else if(yy%400==0||yy%4==0||yy%100!=0 &&mm==2&&dd>28)
		{
			System.out.println("invalid");

		}
		else
		{
			System.out.println("valid");

		}
		
	}
}




