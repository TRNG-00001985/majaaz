
public class leap {
public static void main (String args[]) {
	System.out.print(leap(1957));
}

public static boolean leap(int a)
{
	boolean b=false;
	if(a%4==0)
	{
		b=true;
	if(a%100==0)
	{
		if(a%400==0)
		{
			b=true;
		}
		else
			b=false;
	}
	}
	
	return b;
}
}
