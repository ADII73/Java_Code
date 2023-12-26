import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
//        while loop

//        int i=1;
//        while (i<=4)
//        {
//            System.out.println(i);
//            i++;
//        }

//        do while loop

//        int b =1;
//        do {
//            System.out.println(b);
//            b++;
//        }
//        while (b<=45);

//        for loop
//        int n=5;
//        for (int i=0;i<n;i++)
//        {
//            System.out.println(2*i+1);
//        }


        int n;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        for (int i=n;i>0;i--)
        {
            System.out.println(i);
        }
    }
}
