import java.util.Arrays;

public class getmax {
public static void main(String args[])
{
	int a[]= {65,43,2,4};
	Arrays.sort(a);
	System.out.println("the min is "+ a[0] +",the max is" +a[a.length-1]);
	
	int diff=a[a.length-1] - a[0];
	System.out.println(diff);
}
}
