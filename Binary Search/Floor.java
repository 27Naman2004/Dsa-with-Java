class Floor {
    static int floor(int[] arr, int target) {

        if (target < arr[0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // to avoid overflow of the integer in case of large numbers in java
            if (arr[mid] <= target) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        int target = 5;
        System.out.println(floor(arr, target));
    }
}