package JAVA;

import java.util.Scanner;

public class kmultiplesrecusrion {

    static void kmul(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        kmul(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        kmul(n,k);
    }
}
