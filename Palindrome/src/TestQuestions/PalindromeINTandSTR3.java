package TestQuestions;

class PalindromeINTandSTR3 {
    public static void main(String[] args) {
        // convert these strings to either lowercase or uppercase to create consistency
        System.out.println(isPalindrome("radar".toLowerCase()));
        // Naman wouldn't have been palindrome if toLowerCase method wasn't used
        System.out.println(isPalindrome("Naman".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("12345".toLowerCase()));
    }
    private static boolean isPalindrome(String original) {
        String reversed = "";
        int len = original.length();
        for (int i = len - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        return original.equals(reversed);
    }}
