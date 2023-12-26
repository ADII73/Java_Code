import java.util.Scanner;
public class loopsQuestions {
    public static void main(String[] args) {
//        int n=4;
//        for (int i=n;i>0;i--)
//        {
//            for (int j=0;j<i;j++)
//            {
//            System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        int n, sum=0;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.println("sum is ");
        System.out.println(sum);
//    }
//        int n;
//        System.out.println("Enter the number:");
//                    Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//        for (int i=0;i<=10;i++)
//        {
//            System.out.printf("%d X% d= %d\n", n,i,n*i);
//        }
    }
    }
