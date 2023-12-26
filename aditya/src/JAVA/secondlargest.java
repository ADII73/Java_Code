package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {

    static int maximum(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int scndmax(int arr[]){
        int max1=maximum(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==max1){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=maximum(arr);
        return secondmax;
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
        System.out.println(scndmax(arr));

    }
}
