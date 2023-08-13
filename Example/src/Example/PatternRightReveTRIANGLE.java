package Example;

public class PatternRightReveTRIANGLE {
public static void main(String[] args)
{
	int row =7;
	for(int i=1;i<row;i++) {
		for(int j=1;j<row;j++) {
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("@");
			}
		}
		System.out.println();
	}
}
}
