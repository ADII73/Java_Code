public class fobs {
    public static int bs(int arr[],int target){
        int st=0;
        int end=arr.length-1;
        int fo=-1;    //let first occurence index=-1
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){    // mid==target then fo= mid but mid may not be the first occurence therfore change end=mid-1
                fo=mid;
                end=mid-1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5,6,6,7,8,9};
        System.out.println(bs(arr,6));
    }
}
