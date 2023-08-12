package TestQuestions;

public class PalindromeSTR {
 public static void main(String[] args)
 {
	 String str = "MOM",r = " ";
	 int length = str.length();
	 for(int i=1;i>0;i--) {
		 r=r+str.charAt(i);
	 }
  if (str.toLowerCase().equals(r.toLowerCase())) {
	System.out.println(str+" NO it not a Palindrome");
} else {
System.out.println(str+" NO it not a Palindrome");
}	 
 }
}
