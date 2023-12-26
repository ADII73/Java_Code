package JAVA;

import java.util.Scanner;

public class prefixsum {

    static void printarray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] prefix(int arr[]){
//        int pref[]=new int[arr.length];
//        pref[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array: ");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        printarray(arr);
        int pref[]=prefix(arr);
        printarray(pref);


    }
}
