package JAVA;

import java.util.Scanner;

public class sumofdigitrecursion {

    static int sod(int n){
        if(n>=0 && n<=9) return n;  // base case

        int ans= sod(n/10) + (n%10);  // recursive work+ self work(+)
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sod(n));
    }
}
