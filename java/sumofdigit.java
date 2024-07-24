
public class sumofdigit {
public static void main (String args[])
{
	int rem=0;
	int n=1223;
	int s=0;
	while(n>0)
	{
		int temp=n%10;
		rem=rem+temp;
		n=n/10;
	}
	
	System.out.print(rem);
}
}
