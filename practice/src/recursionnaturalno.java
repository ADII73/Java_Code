import java.util.Scanner;

public class recursionnaturalno {
    static void natural(int n){
        if(n==1) {
            System.out.println("1");
            return;
        }

        System.out.println(n);
        natural(n-1);

    }
    public static void main(String[] args) {
        int n=5;
        natural(n);
    }
}
