import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Original_n=n;
        int SumOfDigits=0;
        while (n>0)
        {
            SumOfDigits += n%10;
            n=n/10;
        }
        System.out.println("Sum of digits in " + Original_n + " = " + SumOfDigits);
    }
}
