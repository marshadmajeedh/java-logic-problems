public class TwoPointer {
    public static boolean isPairExist(int[] arr, int target) {

        int right = arr.length - 1;
        int left = 0;
        int sum = 0;

            while (right > left) {

                sum = arr[left] + arr[right];

                if (sum >  target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    System.out.println(left+" "+right);
                    return true;
                }
            }
        System.out.println(left+" "+right);
        return false;
    }
}
