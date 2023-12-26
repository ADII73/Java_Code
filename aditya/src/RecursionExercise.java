public class RecursionExercise {
//    static int factorial(int n){
//        if (n==0)
//            return 1;
//
//            int SmallAns = factorial(n-1);
//            int ans = n*SmallAns;
//            return ans;
//
//    }
//    public static void main(String[] args) {
//        System.out.println(factorial(4));
//
//
//    }
    static int fibopnacci(int n){
        if (n==1) {
            return 1;
        }
            int previous=fibopnacci(n-1);
            int prevprev=fibopnacci(n-2);
            return previous+prevprev;
    }
    public static void main(String[] args) {
        System.out.println(fibopnacci(5));
    }
}
