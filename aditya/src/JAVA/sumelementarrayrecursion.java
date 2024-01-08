package JAVA;

public class sumelementarrayrecursion {
    static int sumarr(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }
        int smallans=sumarr(arr,idx+1);
        return smallans+arr[idx];
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,10};
        System.out.println(sumarr(arr,0));
    }
}
