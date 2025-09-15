class first {
    public static void main(String[] args) {
        message3(1);
    }
    static void message(int n){
        System.out.println(n);
        message1(2);
    }
    static void message1(int n){
        System.out.println(n);
        message2(3);
    }
    static void message2(int n){
        System.out.println(n);
        
    }

    // in gernalization we can use recursionin this way means alternative a=way is 
    static void message3(int n){
        // base condition
        if(n==5){
            System.out.println(n);
            return;
        }
        // body
        System.out.println(n);
        // recursive call
        message3(n+1);
    }
}
