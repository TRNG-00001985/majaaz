
public class ispali {
public static void main(String args[])
{
	String s="mada";
	char c[]=s.toCharArray();
	String ss=s;
	int s1=0;
	int e=s.length()-1;
	while(s1<=e)
	{
		char temp=c[s1];
		c[s1] =c[e];
		c[e]= temp;
		s1++;
		e--;
	}
	String b=new String(c);
	if(b.equals(ss))
	{
		System.out.print("pal");
	}
	else
	{
		System.out.print("not pal");
	}
}
}
