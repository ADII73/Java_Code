import java.util.Scanner;

public class checkpartition {

    static boolean partition(int arr[]){
        int totalsum=0;
        for (int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        int prefixsum=0;
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];

            int suffixsum=totalsum-prefixsum;
            if (suffixsum==prefixsum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array: ");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(partition(arr));
    }
}
