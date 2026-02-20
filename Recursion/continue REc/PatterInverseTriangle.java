public class PatterInverseTriangle{

    static void inc(int r, int c){
        if(r == 0) return;
        if(c < r){
            inc(r, c+1);
            System.out.print("* ");
        } else {
            inc(r-1, 0);
            System.out.println();
        }
    }

    static void dec(int r, int c){
        if(r == 0) return;
        if(c < r){
            System.out.print("* ");
            dec(r, c+1);
        } else {
            System.out.println();
            dec(r-1, 0);
        }
    }
    public static void main(String[] args) {
        
        inc(4, 0);
        dec(4, 0);
        
    }
}