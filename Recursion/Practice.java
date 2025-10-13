class Practice {
    // printing numbers from n to 1
    static void printNto1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNto1(n - 1);
        System.out.println();
        print1toNAlt(5);
    }

    
    // printing numbers from 1 to n
    static void print1toN(int n) {
        if (n == 6)
        return;
        System.out.println(n);
        print1toN(n + 1);
    }
    // alternatively
    static void print1toNAlt(int n) {
        if (n == 0)
        return;
        print1toNAlt(n - 1);
        System.out.println(n);
    }
    // factorial of n
    static long factorial(int n) {
        if (n == 0)
        return 1;
        return n * factorial(n - 1);
    }

    // sum of digits of n
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    // reverse of a number
    static int reverseNumber(int n, int digits) {
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1)) + reverseNumber(n / 10, digits - 1);
    }
    
    // count zeros in a number
    static int countZeros(int n) {
        if (n == 0)
            return 0;
        int count = 0;
        if (n % 10 == 0)
            count++;
        return count + countZeros(n / 10);
    }

    // palindrome number
    static boolean isPalindrome(int n, int digits) {
        return n == reverseNumber(n, digits);
    }

    public static void main(String[] args) {
        printNto1(5);
        System.out.println();
        print1toN(1);
        System.out.println("Factorial of 19 is: " + factorial(19));
        System.out.println("Sum of digits of 1234 is: " + sumOfDigits(1234));
        System.out.println("Reverse of 1234 is: " + reverseNumber(1234, 4));
        System.out.println("Count of zeros in 10203040 is: " + countZeros(10203040));
        System.out.println("Is 12321 a palindrome number: " + isPalindrome(12321, 5));
        System.out.println("Is 12345 a palindrome number: " + isPalindrome(12345, 5));      
    }
}