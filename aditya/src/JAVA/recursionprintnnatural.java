package JAVA;

import java.util.Scanner;

public class recursionprintnnatural {

    static void printn(int n){
        if(n==1){
            System.out.println(n);
            return;
        }else{
            printn(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printn(n);

    }
}
