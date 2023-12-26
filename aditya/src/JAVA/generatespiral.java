package JAVA;

import java.util.Scanner;

public class generatespiral {

    static void printarray(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] printspiralorder(int n){
        int[][] matrix=new int[n][n];
        int toprow=0, rightcolumn=n-1,bottomrow=n-1,leftcolumn=0;
        int current=1;
        while(current<=n*n){
            // toprow--> leftcolumn to rightcolumn
            for(int j=leftcolumn;j<=rightcolumn && current<=n*n;j++){
                matrix[toprow][j]=current;
                current++;
            }
            toprow++;

            // rightcolummn--> toprow to bottomrow
            for (int i = toprow; i <=bottomrow && current<=n*n; i++) {
                matrix[i][rightcolumn]=current;
                current++;
            }
            rightcolumn--;
            // bottomrow--> rightcolumn to leftcolumn
            for (int j = rightcolumn; j >=leftcolumn && current<n*n; j--) {
                matrix[bottomrow][j]=current;
                current++;
            }
            bottomrow--;
            // leftcolumn--> bottomrow to toprow
            for (int i = bottomrow; i >=toprow && current<n*n; i--) {
                matrix[i][leftcolumn]=current;
                current++;
            }
            leftcolumn++;
        }
        return matrix;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int[][]matrix=printspiralorder(n);
        printarray(matrix);

    }
}
