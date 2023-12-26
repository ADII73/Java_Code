package JAVA;

import java.util.Scanner;

public class rotate90matrix {

    static void printarray(int [][]M){
        for (int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Tinplace(int [][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                // swap
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverseArray(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    static void rotate(int [][] matrix,int r,int c){
        //transpose
        //reverse each row
        Tinplace(matrix,r,c);
        for(int i=0;i<r;i++){
            reverseArray(matrix[i]);
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns for M: ");
        int r=sc.nextInt();
        int c=sc. nextInt();
        int [][] M=new int[r][c];
        System.out.println("Enter arrays M: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                M[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix: ");
        printarray(M);

        rotate(M,r,c);

        System.out.println("Rotated matrix: ");
        printarray(M);
    }
}
