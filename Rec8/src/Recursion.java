public class Recursion {

    public static long powerOfANumber(int i, int j) {

        if (j == 0) {
            return 1;
        }

        return i * powerOfANumber(i, j - 1);
    }
}
