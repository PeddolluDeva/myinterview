package TestQuestions;

public class PalindromeSTR1 {
public static void main(String[] args)
{
	String str = "MADAM";
	StringBuffer sb = new StringBuffer(str);
	String rev = sb.reverse().toString();
	if (rev.equalsIgnoreCase(str)) {
		System.out.println(str+" Yes ");
	} else {
System.out.println(str+" NO ");
	}
}
}
