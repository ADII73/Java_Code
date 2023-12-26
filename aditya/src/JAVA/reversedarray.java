package JAVA;

import java.util.Scanner;

public class reversedarray {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed array: ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
