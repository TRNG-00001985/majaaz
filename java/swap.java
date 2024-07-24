
public class swap {
	public static void main(String args[])
	{
		int a=5;
		int b=6;
		a=a^b;
		b=b^a;
		a=b^a;
		System.out.print(a +","+b);
		
	}
}
