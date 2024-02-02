public class mulktimesofnrecursion {
    public static void print(int n,int k){
        if(k==1) {
            System.out.println(n);
            return;
        }
        print(n,k-1);
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        int n=5;
        int k=4;
        print(n,k);
    }
}
