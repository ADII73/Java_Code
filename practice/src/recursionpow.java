public class recursionpow {

    static int recurspow(int p,int q){
        if(q==0) return 1;

        return recurspow(p,q-1)*p;
    }
    public static void main(String[] args) {
        System.out.println(recurspow(4,4));

    }
}
