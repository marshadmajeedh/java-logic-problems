package reverse_logic;

public class ReverseUtil {
    public static int reverse(int number) {
        StringBuilder sb = new StringBuilder();

        while (number != 0) {
            sb.append(number % 10);
            number /= 10;
        }

        return Integer.parseInt(sb.toString());
    }
}
