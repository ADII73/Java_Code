import java.util.Arrays;
import java.util.Scanner;

public class arrayexercise2 {

    static int lastocc(int[] arr, int x){
        int last=-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == x) {
                last=i;
            }
        }
            return last;
    }
    static void smalllarge(int arr[]){
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("Enter x");
//        int x=sc.nextInt();
//        lastocc(arr,x);
        smalllarge(arr);

    }
}
