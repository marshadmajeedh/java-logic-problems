public static boolean binarySearch(int[] arr, int key, int low, int high) {
    if (low > high) {   // ✅ correct base case
        return false;
    }

    int midIndex = (low + high) / 2;

    if (arr[midIndex] == key) {
        return true;
    }

    if (arr[midIndex] > key) {
        return binarySearch(arr, key, low, midIndex - 1);
    } else {
        return binarySearch(arr, key, midIndex + 1, high);
    }
}
