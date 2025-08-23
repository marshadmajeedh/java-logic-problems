import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recursion {

    public static ArrayList<Integer> fibonacci(int n){

        ArrayList<Integer> series = new ArrayList<>();

        if (n == 0) {
            series.add(0);
            return series;
        }
        if (n == 1) {
            series.add(0);
            series.add(1);
            return series;
        }

        series = fibonacci(n-1);

        int size = series.size();

        int next = series.get(size - 1) + series.get(size - 2);

        series.add(next);
        return series;
    }
}
