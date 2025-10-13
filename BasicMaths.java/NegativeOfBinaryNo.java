public class NegativeOfBinaryNo {
    static int Negative(int n){
        return (~n) + 1;
    }
    public static void main(String[] args) {
        System.out.println(Negative(19));
    }
}
