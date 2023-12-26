package JAVA;

public class arrayrecursion {

    static void printarr(int[]arr,int idx){
        if(idx==arr.length){
            return;
        }

        System.out.println(arr[idx]);

        printarr(arr,idx+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printarr(arr,0);

    }
}
