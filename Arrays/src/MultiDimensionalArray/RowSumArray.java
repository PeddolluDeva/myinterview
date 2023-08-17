package MultiDimensionalArray;

public class RowSumArray {
public static void main(String[] args)
{
	  int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
	  int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
	  int c[][]= new int[3][3];
	  for(int i=0;i<3;i++) {
		  for(int j=0;j<3;j++) {
			  c[i][i]=a[j][j]-b[i][i];
			//	 c[i][i] =a[j][j]+b[i][i];
			 
		  System.out.print(c[i][i]+"  ");
		  }
		  System.out.println();
	  }
}
}
