package DataStructures;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int k= sc.nextInt();
        for (int i=1;i<n;i++){
            for (int j=i;j>0;j--){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.print(arr[k-1]);
    }
}
