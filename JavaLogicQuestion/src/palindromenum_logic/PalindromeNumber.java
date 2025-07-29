package palindromenum_logic;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {

        String num = Integer.toString(number);

        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            sb.append(number % 10);
            number /= 10;
        }

        return sb.toString().equals(num);
    }
}
