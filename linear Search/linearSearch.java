
class linearSearch{
    static int LinearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int LinearSearch2(int [] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static boolean LinearSearch3(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int ans = LinearSearch(arr, target);
        System.out.println(ans);
    }
}
