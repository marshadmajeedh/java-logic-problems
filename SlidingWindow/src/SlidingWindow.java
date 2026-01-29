import java.util.ArrayList;
import java.util.HashMap;

public class SlidingWindow {
    public static int longestSubArray(int[] numbers,int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;

        int maxLength = 0;

        if (numbers.length >= k) {

            for (int i = 0; i < numbers.length; i++) {

                map.put(numbers[i], map.getOrDefault(numbers[i], 0) + 1);
                right+=1;

                while (map.size() > k) {
                    int l = left;
                    left+=1;
                    map.put(numbers[l], map.get(numbers[l]) - 1);
                    if (map.get(numbers[l]) == 0) {
                        map.remove(numbers[l]);
                    }
                }

                int length = right - left;

                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }


        return maxLength;
    }
}
