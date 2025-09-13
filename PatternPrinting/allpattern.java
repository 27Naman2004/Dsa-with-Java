public class allpattern {
    // square pattern
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // right angle triangle
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // inverted right angle triangle
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // pyramid pattern
    static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // nuber right angle triangle
    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // non-inverted andinverted right angle pattern
    static void pattern6(int n){
        for(int i=0;i<2*n;i++){
            int  a = i > n ? 2*n-i : i;
            for(int j=0;j<a;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Dimond pattern
    static  void pattern7(int n){
        for(int i=0;i<2*n;i++){
            int  a = i > n ? 2*n-i : i;
            for(int j=0;j<n-a;j++){
                System.out.print(" ");
            }
            for(int j=0;j<a;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // number pattern]
    static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int space = 0;space < n-i;space++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j +  " ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        
    }
}
