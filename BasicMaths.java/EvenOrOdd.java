class EvenOrOdd{

    // brute force approach
    // time complexity O(1)
    // space complexity O(1)
    static String evenOrOddBruteForce(int n) {
        if(n%2==0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        int n = 5;
        if((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("Brute force approach: " + evenOrOddBruteForce(n));
    }
}