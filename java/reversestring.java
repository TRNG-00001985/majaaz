import java.util.*;

public class reversestring {
public static void main (String args[])
{
	
	
	String s="iammajaaz";
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<s.length();i++)
	{
		sb.append(s.charAt(i));
	}
	System.out.println(sb.reverse());
	char c[]=s.toCharArray();
	int s1=0;
	int e=c.length-1;
	while(s1<=e)
	{
		char temp=c[s1];
		c[s1]=c[e];
		c[e]=temp;
		e--;
		s1++;
	}
	for(int i=0;i<c.length;i++)
	{
	System.out.print(c[i]);
	
	
}
}
}