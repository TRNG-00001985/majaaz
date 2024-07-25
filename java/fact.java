
public class fact {
public static void main(String args[])
{
	System.out.print(facto (4));
}

public static int facto(int n)
{
	if(n==0||n==1)
		return 1;
	else
		return n*facto(n-1);
}
}
