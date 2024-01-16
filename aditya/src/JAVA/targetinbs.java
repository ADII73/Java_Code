package JAVA;

public class targetinbs {
    static int findele(int arr[],int target){
        int st=0, end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target) return mid;

            else if(arr[mid]< arr[end]) {    // from mid to end is sorted
                if(target>arr[mid] && target<=arr[end]){
                    st=mid+1;
                }
                else {
                    end=mid-1;
                }
            }else{                  // st to mid is sorted
                if(target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }else {
                    st=mid+1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={9,10,11,12,1,2,3,4,5,6,8};
        int target=12;
        System.out.println(findele(a,target));
    }
}
