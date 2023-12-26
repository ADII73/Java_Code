import java.util.Scanner;

public class loopss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
//        int noofdigit=0;
//
//        while (n>0){
//            n=n/10;
//            noofdigit++;
//        }
//        System.out.println(noofdigit);



//       int ans=0;
//       while(n>0){
//        ans+=n%10;
//        n=n/10;
//       }
//           System.out.println(ans);





//        int ans=0;
//        for (int i=1;i<=n;i++){
//            if (i%2==0){
//                ans-=i;
//            }
//            else{
//                ans+=i;
//            }
//        }
//        System.out.println(ans);



//        int fact=1;
//        for (int i=1;i<n;i++){
//            fact=fact*i;
//        System.out.println(fact);
//        }

//        int ans=1;
//        int a= sc.nextInt(); int b=sc.nextInt();
//        for (int i = 1; i <=b ; i++) {
//            ans*=a;
//        }
//        System.out.println(ans);

        int count=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0 && n%digit==0){
                count++;
            }
            n/=10;
        }
        System.out.println(count);

    }
}
