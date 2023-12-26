package JAVA;

import java.util.Scanner;

public class sumofdigitrecursion {

    static int sod(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallans=sod(n/10);
        int ans=smallans+n%10;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sod(n));
    }
}
