class OrderAgnosticBS {
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            }
        }

        return -1; // Target not found
    }
}
