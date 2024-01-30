public class selectionsort {

    static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]) min_index=j;
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5, 7, 4, 9, 3, 1,0};
        selection(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
