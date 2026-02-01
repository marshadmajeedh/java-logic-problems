public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;

        while (right < nums.length) {

            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        for(Integer i : nums){
            System.out.print(i+"  ");
        }
        System.out.println();
        return  left+1;
    }
}
