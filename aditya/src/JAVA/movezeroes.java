package JAVA;

import java.util.Scanner;

public class movezeroes {

    static void movezero(int []arr){

        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){

                if(arr[j+1]!=0 && arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        movezero(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
