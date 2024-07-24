import java.util.HashMap;
public class dupli {
public static void main (String args[])
{
	HashMap<Integer,Integer> map=new HashMap<>();
	 int a[]= {1,2,3,4,5,6,7,7,8};
	 for(int i=0;i<a.length-1;i++)
	 {
		 map.put(a[i], map.getOrDefault(a[i],0)+1);
	 }
	 
	 for(int i=0;i<a.length-1;i++)
	 {
		 if(map.get(a[i])>1)
		 {
			 System.out.println(a[i]);
			 break;
		 }
	 }
}
}
