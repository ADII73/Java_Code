package JAVA;

import java.util.Scanner;

public class alternatesumrecursion {

    static  int alter(int n){    //1-2+3-4+5-6+7.....
        if(n==0) return 0; // base case
        if(n%2==0) // even
            return alter(n-1)-n;
        return alter(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(alter(n));
    }

}
