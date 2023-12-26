package JAVA;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int x=sc.nextInt();
        int ans=0;
        while(x>0){
            ans=ans*10+(x%10);
            x/=10;
        }
        System.out.println(ans);
    }
}
