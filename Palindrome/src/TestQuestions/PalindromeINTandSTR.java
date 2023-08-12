package TestQuestions;

public class PalindromeINTandSTR {
public static void main(String[] args)
{
	System.out.println(intstr("MADAM".toLowerCase()));
	System.out.println(intstr("Namen".toLowerCase()));
	System.out.println(intstr("Name".toLowerCase()));
	System.out.println(intstr("123123".toLowerCase()));
	System.out.println(intstr("1234321".toLowerCase()));	
}
public static boolean intstr(String str) {
	String rev = new StringBuilder(str).reverse().toString();
	return str.equals(rev);
}
}
