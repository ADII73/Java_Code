package JAVA;

public class maxinarrayrecursion {

    static int  maxarr(int arr[],int idx){      // big problem - give max of array from idx to end
        if(idx==arr.length-1){                  // base case - if single array then it is the max(single array is at last idx)
            return arr[idx];
        }

        int smallans=maxarr(arr,idx+1);     // recursive - it will give max from idx+1
        return Math.max(arr[idx],smallans);     // self work - compare between small ans and current idx

    }
    static int maxEle(int[] arr){ // iteration method
        int max= arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={45,65,1,54,350};
        System.out.println(maxarr(arr,0));
    }
}
