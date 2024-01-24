public class recursionfacto {
    static int fact(int n){
        if(n==0 || n==1) return 1;

        return fact(n-1)*n;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(n));
    }
}
