package JAVA;

import java.util.Scanner;

public class printspiral {

    static void printarray(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        System.out.println();
        }
    }

    static void printspiralorder(int[][] matrix,int r,int c){
        int toprow=0, rightcolumn=c-1,bottomrow=r-1,leftcolumn=0;
        int totalelements=0;
        while(totalelements<r*c){
            // toprow--> leftcolumn to rightcolumn
            for(int j=leftcolumn;j<=rightcolumn && totalelements<r*c;j++){
                System.out.print(matrix[toprow][j]+" ");
                totalelements++;
            }
            toprow++;

            // rightcolummn--> toprow to bottomrow
            for (int i = toprow; i <=bottomrow && totalelements<r*c; i++) {
                System.out.print(matrix[i][rightcolumn]+" ");
                totalelements++;
            }
            rightcolumn--;
            // bottomrow--> rightcolumn to leftcolumn
            for (int j = rightcolumn; j >=leftcolumn && totalelements<r*c; j--) {
                System.out.print(matrix[bottomrow][j]+" ");
                totalelements++;
            }
            bottomrow--;
            // leftcolumn--> bottomrow to toprow
            for (int i = bottomrow; i >=toprow && totalelements<r*c; i--) {
                System.out.print(matrix[i][leftcolumn]+" ");
                totalelements++;
            }
            leftcolumn++;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        int total=r*c;
        System.out.println("Enter "+total+" values: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix: ");
        printarray(matrix);
        System.out.println("Spiral order: ");
        printspiralorder(matrix,r,c);
    }
}
