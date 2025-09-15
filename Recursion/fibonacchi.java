public class fibonacchi {
    public static void main(String[] args) {
        int n=50;
        System.out.println(fib(n));
    }
    static int fib(int n){
        // base condition
        if(n<=1){
            return n;
        }
        // body and recursive call
        return fib(n-1)+fib(n-2);
    }
}
