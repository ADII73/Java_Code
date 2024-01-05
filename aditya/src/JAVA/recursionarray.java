package JAVA;

public class recursionarray {

    static void printarr(int arr[],int idx){
        if(idx==arr.length) {
            return;
        }

        System.out.println(arr[idx]);

        printarr(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={5,5,2,3,4};
        printarr(arr,0);
    }
}
