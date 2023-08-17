package MultiDimensionalArray;

public class ColAddArray {
public static void main(String [] args) {
	int a[][] = {{1,1,1},{1,1,1},{1,1,1}};
	int b[][]= {{2,2,2},{0,0,0},{4,4,4}};
	//int b[][] = {{0,0,0},{0,0,0},{0,0,0}};
 // int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
 // int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
 //int b[] []  = {{1,2,3},{4,5,6},{7,8,9}};   
  int c[][] = new int [3][3];
  for(int i=0;i<3;i++) {
	  for(int j=0;j<3;j++) {
		  c[i][i]=a[i][i]+b[j][j];
		//  3  1  5  
		// 3  1  5  
		// 3  1  5  	  
		//  c[i][i] =a[j][j]+b[i][i];
		//  3  3  3  
		//  1  1  1  
		//  5  5  5  
		  System.out.print(c[i][i]+"  ");
	  }
	  System.out.println();
  }

}
}
