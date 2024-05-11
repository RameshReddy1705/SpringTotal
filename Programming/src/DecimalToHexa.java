import java.util.Scanner;

//Decimal to Hexa??
public class DecimalToHexa
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		String hexa=" ";
		do
		{
			int d=n%16;
			if(d<10)
			{
				hexa=hexa+d;
				System.out.println((char)(d+55)+hexa);
			}
			else if(d==10)
			{
				hexa=hexa+d;
				System.out.println(hexa);
			}
			else if(d==11)
			{
				hexa=hexa+d;
				System.out.println(hexa);
			}
			else if(d==12)
			{
				hexa=hexa+d;
				System.out.println((char)(d+55)+hexa);
			}
			else if(d==13)
			{
				hexa=hexa+d;
				System.out.println(hexa);
			}
			else if(d==14)
			{
				hexa=hexa+d;
				System.out.println(hexa);
			}
			else if(d==15)
			{
				hexa=hexa+d;
				System.out.println(hexa);
			}
			else if(d==16)
			{
				hexa=hexa+d;
				System.out.println(hexa);
			}
			n=n/16;
		}while(n!=0);
		
	}

}
