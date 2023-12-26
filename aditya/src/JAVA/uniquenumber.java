package JAVA;

import java.util.Scanner;

public class uniquenumber {

    static int unique(int arr[]){
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];

        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(unique(arr));
    }
}
