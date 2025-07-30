public class Automorphic {

    public static void printAutomorphicNumber() {
        int i = 1;

        while (i <= 1000) {

            boolean isAutomorphic = isAutomorphicNumber(i);

            if (isAutomorphic) {
                System.out.println(i+ " is a Automorphic number");
            }
            i++;
        }
    }

    public static boolean isAutomorphicNumber(int number) {

        int squareOfNumber = number * number;
        int length = String.valueOf(number).length();

        while (length != 0) {

            int lastDigitOfNumber = number % 10;
            int lastDigitOfSquareOfNumber = squareOfNumber % 10;
            number /= 10;
            squareOfNumber /= 10;

            if (lastDigitOfNumber != lastDigitOfSquareOfNumber) {
                return false;
            }
            length--;
        }
        return true;
    }
}
