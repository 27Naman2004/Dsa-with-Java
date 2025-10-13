public class LeftmostBit {
    static int leftMostSetBit(int n) {
        if (n == 0) return 0;
        int msb = 0;
        while (n > 1) {
            n  >>= 1; // equivalent to n = n / 2
            msb++;
        }
        return 1 << msb; // equivalent to 2^msb
    }
    // simple way
    static int leftMostSetBitSimple(int n) {
        if (n == 0) return 0;
        int msb = Integer.highestOneBit(n);
        return msb;
    }
    // in 2os way
    static int leftMostSetBit2Os(int n) {
        if(n==0) return 0;
        int count = 0;
        while(n > 1){
            n/=2;
            count++;
        }
        return (int)Math.pow(2, count);
    }

    public static void main(String[] args) {
        int n = 18; // 10010 in binary
        System.out.println("Leftmost set bit of " + n + " is: " + leftMostSetBit(n));
        System.out.println("Leftmost set bit of " + n + " using simple method is: " + leftMostSetBitSimple(n));
    }
}
