package JAVA;

import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        System.out.println("Enter num: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        while(num>0)
        {
            num=num/10;
            count=count+1;
        }
        System.out.println(count);
    }
}
