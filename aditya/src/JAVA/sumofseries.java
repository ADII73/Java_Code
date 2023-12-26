package JAVA;

import java.util.Scanner;

public class sumofseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        System.out.println("Enter series: ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            if (i%2 == 0) {
                ans-=i;
            }
            else {
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}
