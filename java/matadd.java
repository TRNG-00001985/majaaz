
public class matadd {
public static void main (String args[])
{
	int m[][]= {{1,1},{2,2}};
	int n[][]= {{3,3},{4,4}};
	
	int c[][]=new int[m.length][m[0].length];
	
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[0].length;j++)
		{
			c[i][j]=m[i][j]+n[i][j];
		}
	}
	
	printMatrix(c,m.length,m[0].length);
	
	
}

public static void printMatrix(int M[][],
        int rowSize,
        int colSize)
{
for (int i = 0; i < rowSize; i++) {
for (int j = 0; j < colSize; j++)
System.out.print(M[i][j] + " ");

System.out.println();
}
}
}
