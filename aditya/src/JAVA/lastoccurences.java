package JAVA;

import java.util.Scanner;

public class lastoccurences {

    static int lastocc(int arr[],int x){
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array: ");
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        System.out.println(lastocc(arr,x));
    }
}
