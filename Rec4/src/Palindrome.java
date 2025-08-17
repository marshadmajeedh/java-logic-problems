public class Palindrome {
    public static boolean isPalindrome(String str,int i) {

     if (i == str.length() / 2) {
         return true;
     }
     if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length()-i-1)) {
         return false;
     }

     return isPalindrome(str,i+1);
    }
}
