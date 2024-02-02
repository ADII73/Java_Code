public class alternatesumrecursion {
    public static int alternate(int n){
        if(n==0 ) {
            return 0;
        }
        if(n%2==0){
            return alternate(n-1)-n;
        }
        return alternate(n-1)+n;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println( alternate(n));
    }
}
