package JAVA;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fac=1;
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            fac=fac*i;
        System.out.println(fac);
        }
    }
}
