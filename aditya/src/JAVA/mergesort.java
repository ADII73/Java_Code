package JAVA;

public class mergesort {
    static void printarr(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[l+i];
        for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
//                k++;
//                i++;
            }else{
                arr[k++]=right[j++];
//                k++;
//                j++;
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
//            k++;
//            j++;
        }
        while(j<n2){
            arr[k++]=right[j++];
        }

    }
    static void merge_sort(int[] arr, int l, int r){
        if(l>= r) return;
        int mid=(l+r)/2;
        merge_sort(arr,l,mid);
        merge_sort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }

    public static void main(String[] args) {
        int [] arr={4,1,3,2,5};
        int n=arr.length;
        System.out.println("Before sorting");
        printarr(arr);
        merge_sort(arr,0,n-1);
        System.out.println();
        System.out.println("After sorting");
        printarr(arr);
    }
}
