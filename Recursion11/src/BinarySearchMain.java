public class BinarySearchMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println ("Before using insertion sort :");
        PrintArray.printArray(arr);

        SortArray.insertionSort(arr);
        System.out.println ("\nAfter using insertion sort :");
        PrintArray.printArray(arr);

        int keyValue = 10;
        System.out.println ("\nFinding a key value using binary search: ");
        System.out.println ("is the key value is found : "+(BinarySearch.binarySearch(arr,keyValue,0,arr.length) ? "yes "+keyValue : "not found"));
    }
}
