public class PalindromeChecker {
    public static boolean isPalindrome(String str,int i,int j) {

        if (i == j) {
            return true;
        }

        if (str.toLowerCase().trim().charAt(i) != str.toLowerCase().trim().charAt(j)) {
            return false;
        }

        return isPalindrome(str, i + 1, j - 1);
    }
}
