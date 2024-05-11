import java.util.Random;

public class Otp
{
	public static void main(String[] args)
	{
		String num="0123456789";
		int length=10;
		char[] otp=new char[length];
		Random r=new Random();
		for(int i=0;i<length;i++)
		{
			otp[i]=num.charAt(r.nextInt(num.length()));
		}
		System.out.println("OTP : "+new String(otp));
	}
}
