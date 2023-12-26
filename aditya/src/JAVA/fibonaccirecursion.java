package JAVA;

import java.util.Scanner;

public class fibonaccirecursion {

    static int fib(int n){
        if(n==0 || n==1)
            return n;

        int fibo=fib(n-1);
        int fibo1=fib(n-2);
        return fibo+fibo1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
