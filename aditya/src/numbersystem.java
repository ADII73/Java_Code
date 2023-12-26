import java.util.Scanner;

public class numbersystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int binary= sc.nextInt();
//        int ans=0;
//        int pw=1;
//        while(binary>0){
//            int unitdigit=binary%10;
//            ans+=(unitdigit*pw);
//            binary=binary/10;
//            pw*=2;
//        }
//        System.out.println(ans);


        int decimal= sc.nextInt();
        int ans=0;
        int pow=1;
        while(decimal>0) {
            int digit = decimal % 2;
            ans = ans + (digit * pow);
            pow = pow * 10;
            decimal = decimal / 2;
        }
        System.out.println(ans);
        
    }
}
