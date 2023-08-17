package MultiDimensionalArray;

public class RowAddArray {
public static void main(String[] args)
{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{0,9,8},{7,6,5},{4,3,2}};
	int c[][]=new int [3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			  c[i][i] =a[j][j]+b[i][i];
			//c[j][j]=a[][]+b[][];
			  System.out.print(c[i][i]+"  ");
		}
System.out.println();
	}
}
}
