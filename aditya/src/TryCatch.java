public class TryCatch {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        try{
        int c=a/b;
        System.out.println("the result is "+c);
        }
        catch (Exception n){
            System.out.println("We failed. Reason:");
            System.out.println(n);
        }
        System.out.println("Ended");
    }
}
