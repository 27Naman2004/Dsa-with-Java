class first {
    public static void main(String[] args) {
        String name = "Naman";
        String a = "Naman";
        System.out.println(name.equals(a)); // returns true;

        // 2nd
        String name1 = new String("Naman");
        String a1 = new String("Naman");
        System.out.println(name1 == a1);  // returns false;

        // string preforance
        String Leeters = "";
        for(int i=0;i<26;i++){
            Leeters = Leeters + (char)('a' + i);
        }
        System.out.println(Leeters);
    }
}
