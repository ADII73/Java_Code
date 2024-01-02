public class wavearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        int j=i+1;
        while(i<arr.length-1){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
            for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");
    }
}
