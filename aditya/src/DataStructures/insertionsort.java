package DataStructures;

public class insertionsort {
    static void insertionsort(int[] arr){
        for (int i=1;i< arr.length;i++){
            for (int j=i;j>0;j--){

                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={8,6,4,7,2,1};
        insertionsort(arr);
        for (int i:arr) {
            System.out.print(i+" ");

        }
    }
}
