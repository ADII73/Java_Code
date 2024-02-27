public class firstoccuranceusingBS {
    public static int fobs(int arr[],int target){
        int fo=-1;
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                fo=mid;
                end=mid-1;
            }
            else if (arr[mid]>target) {
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
        System.out.println(fobs(arr,6));

    }
}
