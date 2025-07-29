package primenum_logic;

public class PrimeNumber {

    public static boolean isPrime(int number) {

        int count = 0;
        int divisor = 1;

        while (divisor <= number) {
            if (number % divisor == 0) {
                count++;
            }
            divisor++;
        }

        return count <= 2;
    }
}
