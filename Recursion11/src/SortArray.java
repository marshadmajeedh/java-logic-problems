public class SortArray {
    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++){

            int j = i - 1;
            int keyValue = arr[i];

            while (j >= 0 && arr[j] > keyValue){

                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = keyValue;
        }
    }
}
