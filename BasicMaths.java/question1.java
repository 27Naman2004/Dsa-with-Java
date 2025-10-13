public class question1 {
    
    // unique elements in an array

    // brute force approach
    // time cmplexity O(n^2)
    // space complexity O(1)
    static int uniqueElements(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            boolean isUnique = true;
            for(int j=0;j<arr.length;j++) {
                if(i!=j && arr[i]==arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                return arr[i];
            }
        }
        return -1;
    }
    // another approach using sorting
    // time complexity O(nlogn)
    // space complexity O(1)
    static int uniqueElementsSorting(int[] arr) {
        java.util.Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2) {
            if(arr[i]!=arr[i+1]) {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    // optimal approach using XOR
    // time complexity O(n)
    // space complexity O(1)
    static int uniqueElementsXOR(int[] arr) {
        int xor = 0;
        for(int i=0;i<arr.length;i++) {
            xor ^= arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int [] arr= {3,4,1,3,1,5,4};
        System.out.println("Unique element is: " + uniqueElements(arr));
        System.out.println("Unique element using sorting is: " + uniqueElementsSorting(arr));
        System.out.println("Unique element using XOR is: " + uniqueElementsXOR(arr));

    }
}
