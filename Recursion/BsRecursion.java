class BsRecursion {
    public static void main(String[] args) {
        int a [] = {2,3,4,5,6,7,8,9,10,11,12};
        int target = 67;
        int ans = search(a, target, 0, a.length-1);
        System.out.println(ans);
    }
    static int search(int [] arr, int target,int s, int e){
        if(s> e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, s, mid-1);
    }
}
