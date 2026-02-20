public class ResetIthBit {
    static int resetIthBit(int n, int i) {
        return n & ~(1 << (i-1));
    }

    public static void main(String[] args) {
        int n = 5; // 101 in binary
        int i = 1;
        System.out.println("Number after resetting " + i + "th bit of " + n + " is: " + resetIthBit(n, i));
    }
}
