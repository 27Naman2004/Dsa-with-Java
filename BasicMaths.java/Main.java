public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        // And operator
        System.out.println("And operator");
        System.out.println(a & b);
        // check if a is even or odd
        System.out.println("Check if a is even or odd");
        System.out.println((a & 1) == 0 ? "Even" : "Odd");
        // Or operator
        System.out.println("Or operator");
        System.out.println(a | b);

        // finding right most set bit
        int n = 13;
        int rightMostSetBit = n & -n;
        System.out.println("Right most set bit of " + n + " is: " + rightMostSetBit);

        // finding left most set bit
        int leftMostSetBit = Integer.highestOneBit(n);
        System.out.println("Left most set bit of " + n + " is: " + leftMostSetBit);

        // XOR operator
        System.out.println("XOR operator");
        System.out.println(a ^ b);
        // finding XOR of 1 to n
        int num = 5;
        int xor = 0;
        for (int i = 1; i <= num; i++) {
            xor ^= i;
        }
        System.out.println("XOR of 1 to " + num + " is: " + xor);
        
    }
}
