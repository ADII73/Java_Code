import java.util.Scanner;

public class loopsexercise2 {
    public int getSum(int a[], int n)
    {
        // Your code goes here
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a=1;
//        int b=1;
//        int n=sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            System.out.print(a+" ");
//           int sum=a+b;
//           a=b;
//           b=sum;
//        }


//        Scanner scn = new Scanner(System.in);
//        int sum = 0;
//        while(sc.hasNextInt()){ //check if input exists or not
//            int num = sc.nextInt();
//            if(num >= 0){ //if input is positive or zero add it to the current sum
//                sum += num;
//            }
//            else{
//                sum = -1;//input is negative so change sum to -1 and break out of the loop
//                break;
//            }
//        }
//        System.out.print(sum);


//
//        int n= sc.nextInt();
//        int ans=1;
//        for (int i = 2; i <=n ; i++) {
//            ans*=i;
//        }
//        System.out.println(ans);


        int n = sc.nextInt();
        int p=0;
        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            p=p+(digit*digit*digit);
            n=n/10;
        }
        if (p==temp){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


    }
}
