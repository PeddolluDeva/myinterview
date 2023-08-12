package TestQuestions;
public class PalindromeINTandSTR1 {
public static void main(String[] args)
{
	System.out.println(intstr("radar".toLowerCase()));
	System.out.println(intstr("MADAM".toLowerCase()));
	System.out.println(intstr("Naman".toLowerCase()));
	System.out.println(intstr("12321".toLowerCase()));
	System.out.println(intstr("123".toLowerCase()));
	System.out.println(intstr("10101".toLowerCase()));
}
private static  boolean intstr(String str) {
	String revers = "";
	int len = str.length();
	for(int i=len - 1;i>0;i--) {
		revers =revers+str.charAt(i);
	}
	return str.equals(revers);
}
}
