public class Factorial {

    public static long findFactorial(long n){

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return n * findFactorial(n - 1);
    }
}
