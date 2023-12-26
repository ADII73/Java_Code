import java.util.Scanner;

public class Recursion_2 {

    static void natural(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        natural(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        natural(n);
    }
}
