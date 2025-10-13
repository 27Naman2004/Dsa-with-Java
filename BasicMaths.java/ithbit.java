public class ithbit {
    static boolean isIthBitSet(int n, int i) {
        return (n & (1 << (i-1))) != 0;
    }
    public static void main(String[] args) {
        int n = 3;
        int i = 2;
        System.out.println("Is " + i + "th bit set in " + n + ": " + isIthBitSet(n, i));
    }
}
