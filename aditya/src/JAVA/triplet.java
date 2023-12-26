package JAVA;

import java.util.Scanner;

public class triplet {

    static int trp(int arr[],int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int t=sc.nextInt();
        System.out.println(trp(arr,t));
    }
}
