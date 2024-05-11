import java.util.Scanner;

public class CountVowels
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		
		int VowelsCount=0,Constraints=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				VowelsCount++;
			}
			else
			{
				Constraints++;
			}
			
		}
		System.out.println("VowelsCount-->"+VowelsCount);
		System.out.println("Constraints-->"+Constraints);
	}

}
