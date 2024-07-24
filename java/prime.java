
public class prime {
public static void main (String args[]) {
	prime(100);
	comp(100);
}

public static void prime(int a)
{
	boolean k=true;
	if(a%2==0)
	{
		k=false;
	}
	for(int i=3;i<a;i++)
	{
		if(a%i==0)
		{
			k=false;
		}
	}
	
	if(k==true)
	{
		System.out.print("prime");
	}
}
public static void comp(int a)
{	
	int c=0;
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			c++;
		}
	}
	if(c>=3)
	{
		System.out.print("cposite");
	}
}	
}

