import java.util.Scanner;

public class AmountNotes
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int am= sc.nextInt();
		System.out.println("2000 rs :"+am/2000);
		am=am%2000;
		System.out.println("5000 rs :"+am/500);
		am=am%500;
		System.out.println("200 rs :"+am/200);
		am=am%200;
		System.out.println("100 rs :"+am/100);
		am=am%100;
		System.out.println("50 rs :"+am/50);
		am=am%50;
		System.out.println("20 rs :"+am/20);
		am=am%20;
		System.out.println("10 rs :"+am/10);
		am=am%10;
		System.out.println("5 rs :"+am/5);
		am=am%5;
		System.out.println("2 rs :"+am/2);
		am=am%2;
		System.out.println("1 rs :"+am);
		
		
	}

}
