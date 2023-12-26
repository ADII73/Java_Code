import java.util.Scanner;

public class zeroesones {

    static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortzeroone(int[] arr){
        int zeroes=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0);
            zeroes++;
        }

        for (int i = 0; i <arr.length ; i++) {
            if(i<zeroes){
                arr[i]=0;
            }else {
                arr[i]=1;
            }

        }
    }

    static void twopointer(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if (arr[left] ==1 && arr[right]==0) {
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("Enter "+n+" elements");
        for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
//        sortzeroone(arr);
        twopointer(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
