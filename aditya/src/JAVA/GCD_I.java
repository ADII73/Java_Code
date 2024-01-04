package JAVA;

import java.util.Scanner;

public class GCD_I {

    static int gcdr(int x,int y){     // gcd using recusrsion
        if(y==0) return x;

        return gcdr(y,x%y);
    }
    static int gcdi(int x,int y){    // gcd iterative approach
        while(x % y!=0){
            int rem=x % y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcdi(x,y));
        System.out.println(gcdr(x,y));
    }
}
