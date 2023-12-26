package JAVA;

import java.util.Scanner;

public class q_queriesprefix {

    static void printarray(int arr[]){
        for (int i=1;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] prefix(int arr[]){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter array: ");
        for (int i = 1; i <=size ; i++) {
            arr[i]=sc.nextInt();
        }
        int pref[]=prefix(arr);
        System.out.println("Enter number of queries: ");
        int q=sc.nextInt();
        while(q-- >0){
            System.out.println("Enter l: ");
            int l=sc.nextInt();
            System.out.println("Enter r: ");
            int r=sc.nextInt();
            int ans=pref[r]-pref[l-1];
            System.out.println(ans);
        }


    }
}
