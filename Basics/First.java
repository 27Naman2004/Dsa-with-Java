import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // use long for larger numbers

        if (n == 0) {
            System.out.println(1);
        } else {
            n = Math.abs(n); // handle negative numbers
            int ans = (int) (Math.log10(n) + 1);
            System.out.println(ans);
        }
    }
}
