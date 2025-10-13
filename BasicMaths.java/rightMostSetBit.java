public class rightMostSetBit {
    static int rightMostSetBit(int n) {
        return n & -n; //equivalent to n & (~n + 1)
    }
    public static void main(String[] args) {
        int n = 18; // 10010 in binary
        System.out.println("Rightmost set bit of " + n + " is: " + rightMostSetBit(n));
    }
}
