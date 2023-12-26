package JAVA;

import java.util.Scanner;

public class matrixmultiply {

    static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void mul(int a[][], int r1,int c1,int b[][],int r2,int c2){
        if (c1!=r2){
            System.out.println("Wrong input");
            return;
        }

        int [][] mul=new int [r1][c2];
        for (int i=0;i<r1;i++){// rows
            for (int j=0;j<c2;j++){  //columns
                for(int k=0;k<r1;k++) {
                    mul[i][j] = mul[i][j]+ a[i][k] * b[k][j];
                }
            }
            System.out.println();
        }
        printarray(mul);
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

        mul(arr,r,c,arr2,r1,c1);
    }
}
