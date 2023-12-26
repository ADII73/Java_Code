package JAVA;

import java.util.Scanner;

public class matrixaddition {


    static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int a[][], int r,int c,int b[][],int r1,int c1){
        if (r!=r1 || c!=c1){
            System.out.println("Wrong input");
            return;
        }

        int [][] sum=new int [r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
            System.out.println();
        }
        printarray(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns for M1: ");
        int r=sc.nextInt();
        int c=sc. nextInt();
        int [][] arr=new int[r][c];
        System.out.println("Enter arrays M1: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter rows and columns for M2: ");
        int r1=sc.nextInt();
        int c1=sc. nextInt();
        int [][] arr2=new int[r1][c1];
        System.out.println("Enter arrays M2: ");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        printarray(arr);
        System.out.println("Matrix 2: ");
        printarray(arr2);
        add(arr,r,c,arr2,r1,c1);
    }
}
