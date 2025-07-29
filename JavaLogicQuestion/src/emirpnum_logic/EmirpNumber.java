package emirpnum_logic;

import palindromenum_logic.PalindromeNumber;
import primenum_logic.PrimeNumber;
import reverse_logic.ReverseUtil;

public class EmirpNumber {

    public static void findEmirpNumberAndPrint() {

        int i = 2;

        while (i <= 1000) {

            int j = ReverseUtil.reverse(i);

            if (PrimeNumber.isPrime(i) && PrimeNumber.isPrime(j) && !PalindromeNumber.isPalindrome(i)) {
                System.out.println(i+" is a Emirp number");
            }

            i++;
        }
    }
}
