import java.util.ArrayList;

public class HappyNumber {

    public static int squareOfaNumber(int num) {
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit;
            num /= 10;
        }
        return sum;
    }
    public static boolean isHappyNumber (int i) {

        ArrayList<Integer> seenNumber = new ArrayList<>();

        while (i != 1 && !seenNumber.contains(i)) {
            seenNumber.add(i);
            i = squareOfaNumber(i);
        }
        return i == 1;
    }

    public static void printHappyNumber () {

        int i = 1;
        int j = i;
        while (i <= 1000) {

            if (isHappyNumber(i)) {
                System.out.println(i+ " is a Happy number");
            }
            i++;
        }
    }
}
