public class Recursion {

    public static int sumOfAnArray(int[] arr,int i,int sum) {

        if (i == arr.length) {
            return sum;
        }

        return sumOfAnArray(arr, i+1,sum +  arr[i]);
    }
}
