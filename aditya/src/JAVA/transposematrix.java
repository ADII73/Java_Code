package JAVA;

import java.util.Scanner;

public class transposematrix {

    static void printarray(int [][]M){
        for (int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                System.out.print(M[i][j]+" ");
            }
        System.out.println();
        }
    }

    static int [][] trans(int [][] arr, int r, int c){
        int ans[][]=new int[c][r];
        for (int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
            return ans;
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

        System.out.println("Transpose Matrix: ");
        Tinplace(M,r,c);
        printarray(M);
//        int ans[][]=trans(M,r,c);
//        printarray(ans);

    }
}
