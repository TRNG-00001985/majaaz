
public class mattrans {
public static void main (String args[])
{
	int a[][]= {{1,2,3},
			   {2,1,3},
			   {3,2,1}};
	
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[0].length;j++)
		{
			
			a[i][j]=a[j][i];
			
		}
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++)
		System.out.print(a[i][j] + " ");

		System.out.println();
		}
		}
	
}

