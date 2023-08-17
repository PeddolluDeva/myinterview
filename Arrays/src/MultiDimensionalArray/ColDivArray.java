package MultiDimensionalArray;

public class ColDivArray {
public static void main(String[] args)
{
	int a[][]= {{2,4,6},{3,6,9},{4,8,12}};
	int b[][]= {{2,2,2},{3,3,3},{4,4,4}};
	int c[][] = new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			c[i][j]=a[i][j]/2;
		//	c[i][j]=b[i][j]/2;
			System.out.print(c[i][j]+" ");
			//System.out.print(c[i][j]+" ");
		}
		
		System.out.println();
	}
	}
}

