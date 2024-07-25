
public class inheritenceex implements interface1 {
	int a=5;
	int b=5;
	public int getSum()
	{
		return a+b;
	}
	public int getProduct()
	{
		return a*b;
	}
	
	
	public static void main(String args[])
	{
		inheritenceex i=new inheritenceex();
		System.out.println(i.getSum());
		System.out.println(i.getProduct());
	}
	
}
