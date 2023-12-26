package JAVA;

import java.util.Scanner;

public class factorialusingrecursion {

    static int printfact(int n){
        if(n==0){
            return 1;
        }
        int fac=printfact(n-1);
        int finals=fac*n;
        return finals;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(printfact(n));
    }
}
