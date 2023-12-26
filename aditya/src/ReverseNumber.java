import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Original_n=n;
        int ans=0;

        while (n>0)
        {
            ans = (ans * 10) + (n % 10);
            n = n/10;
        }
        System.out.println("Reversed Number of " + Original_n + "=" + ans);
    }
}
