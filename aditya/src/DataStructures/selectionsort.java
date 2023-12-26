package DataStructures;

public class selectionsort {
    static void selectionsort(int [] arr){
        for (int i=0;i< arr.length-1;i++){                     //  i represent current index
            int min_index=i;                                //assigning min_index as i. when i=0 min-index=0, i=1 min_index=1
            for (int j=i+1;j< arr.length;j++){              // find minimum element in unsorted array
                if (arr[min_index]<arr[j]){
                    min_index=j;                            // when found update the element in min_index
                }
            }
            int temp=arr[i];                                // swap the minimum element with current element. arr[min_index] and arr[i]
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }

    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4};
        selectionsort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }


    }
}
