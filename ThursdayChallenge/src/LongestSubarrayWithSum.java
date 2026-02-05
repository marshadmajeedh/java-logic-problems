public class LongestSubarrayWithSum {
    public static int longestSubarray(int[] nums, int target) {

        int sum = 0;
        int length = 0;
        int maxLength = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum > target) {
                sum -= nums[left++];
            }

            length = (i+1) - left;

            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
