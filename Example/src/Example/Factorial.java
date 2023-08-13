package Example;

public class Factorial {
public static void main(String[] args)
{
	int num = 4;
	long factorial = 1;
	for(int i=1;i<=num;i++) {
		factorial *= i;
	}
	System.out.println(" Factoral Number :- "+factorial);
	//System.out.printf("Factorial of %d = %d", num, factorial)
}
}
