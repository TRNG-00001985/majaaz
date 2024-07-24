
public class fibonacci {
public static void main (String args[])
{
	System.out.print(fib(5));
}

public static int fib(int n)
{
	if(n==0 ||n==1)
		return n;
	if(n==2)
		return 1;
	else
		return fib(n-1) + fib(n-2);
}
}
