package JAVA;

import java.util.Scanner;

public class rotatedbinarysearch {
    static int fidmin(int arr[]){
        int n=arr.length;
        int st=0, end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={5,6,7,8,9,1,2,3,4};
        System.out.println(fidmin(a));
    }
}
