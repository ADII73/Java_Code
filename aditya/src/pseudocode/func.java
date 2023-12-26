package pseudocode;

public class func {

        static int func(int a,int b){
            if (a<b){
                return func(b,a);
            }
            else if (b!=0) {
                return (a+func(a,(b-1)));

            }else {

                return 0;
            }
        }
        public static void main(String[] args) {
            int a=8,b=9;
//        func(8,9);
            System.out.println(func(8,9));
        }
    }


