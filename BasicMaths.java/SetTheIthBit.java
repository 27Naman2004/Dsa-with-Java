public class SetTheIthBit {
    static int setIthBit(int n, int i) {
        return n | (1 << (i - 1));
    }

    public static void main(String[] args) {
        int n = 5; // 101 in binary
        int i = 2;
        System.out.println("Number after setting " + i + "th bit of " + n + " is: " + setIthBit(n, i));
    }
}
