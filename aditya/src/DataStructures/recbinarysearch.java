package DataStructures;

public class recbinarysearch {
    static boolean recubs(int[]arr,int st,int end,int target){
        if (st>end)return false;
        int mid=(st+end)/2;
        if (target==arr[mid]) return true;
        else if (target<=arr[mid]) {
         return    recubs(arr,st,mid-1,target);
        }
        else {
         return    recubs(arr,mid+1,end,target);
        }

    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int target=9;
        System.out.println(recubs(arr,0, arr.length-1,target));
    }
}
