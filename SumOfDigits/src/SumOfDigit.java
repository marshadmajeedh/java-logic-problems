public class SumOfDigit {

    public static long sumOfDigit(int number) {

        if (number < 0) {
            number = Math.abs(number);
        }
        if (number == 0) {
            return 0;
        }

        int lastDigit = number % 10;
        number = number / 10;

        return lastDigit + sumOfDigit(number);
    }
}
