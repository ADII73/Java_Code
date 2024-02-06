public class findelementbs {
    public static int findele(int arr[],int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target) return mid;

            // in bs there must be one part of array thst is sorted
            // either st to mid or mid+1 to end

            else if (arr[mid]<arr[end]){        // if mid<end therefore this part is sorted
                if(target>arr[mid] && target<arr[end]){
                    st=mid+1;
                }else {
                    end=mid-1;
                }
            }
            else{
                if (target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }else {
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={9,10,11,12,1,2,3,4,5,6,7,8};
        System.out.println(findele(arr,1));
    }
}
