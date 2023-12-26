import java.util.Scanner;

public class matrixmultiply {

    static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    static void arr(int[][] matA, int r1, int c1, int[][] matB, int r2, int c2){
        if(c1!=r2){
            System.out.println("Wrong input");
            return;
        }
        int ans[][]=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for (int k=0;k<r1;k++){
                    ans[i][j]+=matA[i][k]*matB[k][j];
                }
            }
            System.out.println();

        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r1 and c1 of matA: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int matA[][]=new int[r1][c1];
        System.out.println("Enter arrays of matA: ");
        for (int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter r2 and c2 of matB: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int matB[][]=new int[r2][c2];
        System.out.println("Enter arrays of matB: ");
        for (int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matB[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        printarray(matA);
        System.out.println("Matrix 2: ");
        printarray(matB);
        System.out.println("Ans is: ");
        arr(matA,r1,c1,matB,r2,c2);

    }
}
