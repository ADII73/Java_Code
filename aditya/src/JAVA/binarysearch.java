package JAVA;

public class binarysearch {

    static boolean bsearch(int arr[],int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
        int mid=(st+end)/2;

            if(arr[mid]==target) return true;

            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=0;
        System.out.println(bsearch(arr,target));

    }
}
