package Example;

import java.util.Scanner;

public class Factorial2 {
public static void main(String[] arhgs)
{
	Scanner sc = new Scanner(System.in);
  System.out.println("Enter  the Number :- ");
	int num  = sc.nextInt();
	//int num = 5;
	int fact = 1;
	for(int i=1;i<=num;i++) {
		fact = fact*i;
		System.out.println("Factorial of the  number :- "+ fact);
	}
}
}
