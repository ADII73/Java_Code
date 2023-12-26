import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int NumOfDigits=0;
        int Original_n=n;


        while (n>0)
        {
            n=n/10;
            NumOfDigits++;
        }
        System.out.println("Number of digits in " + Original_n + " = " + NumOfDigits);


    }
}
