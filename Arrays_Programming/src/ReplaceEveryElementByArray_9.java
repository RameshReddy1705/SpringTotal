import java.util.Scanner;
public class ReplaceEveryElementByArray_9
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n= sc.nextInt();
		
		int []ar=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	
		int []dr=replaceEveryElementByArray(ar);
		for(int i=0;i<dr.length;i++)
		{
			System.out.println(dr[i]+"  ");
		}
	}

	static int[] replaceEveryElementByArray(int[] x)
	{
		for(int i=0;i<x.length;i++)
		{
				int sum=0;
				do
				{
					int d=x[i]%10;
					sum=sum+d;
					x[i]=x[i]/10;
				}while(x[i]!=0);
				x[i]=sum;
			
		}
		return x;
		
		
		
	}
}




/*int []u=new int[x[i]];
int sum=0;
for(int j=0;j<u.length;j++)
{
	sum=sum+u[j];
}*/
