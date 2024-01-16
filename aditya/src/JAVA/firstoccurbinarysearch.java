package JAVA;

public class firstoccurbinarysearch {
    static int fosearch(int arr[],int x){
        int st=0;
        int end=arr.length-1;
        int fo=-1;
        while (st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==x){
                fo=mid;
                end=mid-1;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[]={15,5,5,5,6,2,4};
        int x=5;
        System.out.println(fosearch(arr,x));
    }
}
