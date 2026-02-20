

        public class TorweOfHanoi {
            static void toh(int n, char fr, char tor, char h){
                if(n==0) return;
                toh(n-1, fr, h, tor);
                System.out.print(n + fr + "-> " + tor);
                toh(n-1, h,tor,fr);
            }
            public static void main(String[] args) {
                int n = 3;
                toh(n,'A','B','C');

            }
        }
