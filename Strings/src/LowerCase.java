import java.util.Scanner;

public class LowerCase
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println(ch);
	}

}
