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

        // String builder
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append((char)('a' + i));
        }
        System.out.println(sb);
        // operations on sb;
        sb.setCharAt(0,'N');
        System.out.println(sb);
        sb.insert(0,'A');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Naman");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("NamanNamanNamanNamanNaman");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

        
    }
}
