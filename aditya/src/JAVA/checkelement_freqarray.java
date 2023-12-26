package JAVA;

import java.util.Scanner;

public class checkelement_freqarray {

    static int[] makefreq(int arr[]){
        int frequency[] =new int[100005];
        for (int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        return frequency;
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
        int freq[]=makefreq(arr);
        System.out.println("Enter queries: ");
        int q=sc.nextInt();

        while (q>0){
            System.out.println("Enter number: ");
            int num=sc.nextInt();
            if (freq[num]>0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            q--;
        }
    }
}
