package Example;

public class PatternLiftReversTRIANGLE {
public static void main(String[] args)
{
	int row = 8;
	for(int i=1;i<row;i++) {
		for(int j=i;j<row;j++) {
			System.out.print("  $  ");
		} 
		System.out.println();
	}
}
}
