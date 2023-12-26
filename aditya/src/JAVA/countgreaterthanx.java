package JAVA;

import java.util.Scanner;

public class countgreaterthanx {

    static int count(int arr[],int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array: ");
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        System.out.println(count(arr,x));
    }
}
