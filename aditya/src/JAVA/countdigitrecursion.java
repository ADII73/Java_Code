package JAVA;

import java.util.Scanner;

public class countdigitrecursion {

    static int number(int n){
        if (n/10==0)
            return 1;
        return 1+number(n/10) ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(number(n));

    }
}
