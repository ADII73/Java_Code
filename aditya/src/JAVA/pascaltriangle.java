package JAVA;
import java.util.Scanner;
public class pascaltriangle {

    static void printarray(int [][]M){
        for (int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] pascaltriangle(int n){
        //n number of rows
        int ans[][]=new int[n][];
        for (int i=0;i<n;i++){
            //R0 has 1C        0 []
            //R1 has 2C        1 [] []
            //R2 has 3C        2 [] [] []
            //                 3 [] [] [] []
            ans[i]=new int[i+1];
            // 0 [1]
            // 1 [1] [1]
            // 2 [1] [] [1]
            // 3 [1] [] [] [1]
            ans[i][0]=ans[i][i]=1;

            for (int j=1;j<i;j++) {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n rows: ");
        int n=sc.nextInt();
        int [][] ans=pascaltriangle(n);
        printarray(ans);

    }
}
