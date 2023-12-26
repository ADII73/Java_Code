package JAVA;

import java.util.Scanner;

public class countoccurences {

    static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of arrary: ");
        int n=sc.nextInt();
        System.out.println("Enter array: ");
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);

    }
}
