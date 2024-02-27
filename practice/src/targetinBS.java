public class targetinBS {
    public static int findele(int arr[],int x){
        int st=0;
        int end=arr.length-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==x) return arr[mid];

            else if (arr[mid]<arr[end]) {   // mid to end is sorted
                if(x>arr[mid] && x<=arr[end]){
                    st=mid+1;
                }else {
                    end=mid-1;
                }
            }
            else {                   // st to mid is sorted
                if(x>arr[st] && x<=arr[mid]){
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
        System.out.println(findele(arr,12));
    }
}
