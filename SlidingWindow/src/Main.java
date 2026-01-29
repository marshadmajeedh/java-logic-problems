import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]array = {1,2,1,1,3,4,1,2};
        int[] array1 = {1,2,1,2,2};
        System.out.println(SlidingWindow.longestSubArray(array1,2));
    }
}