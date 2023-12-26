import java.util.Arrays;
import java.util.Scanner;

public class arrayexercise1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the length of array");
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = scn.nextInt();
//        }
//        int[] ans = new int[n];
//        int idx = 0;
//        for(int i = 0; i < n; i++){
//            if(arr[i] >= 0){
//                ans[idx] = arr[i];
//                idx++;
//            }
//        }
//        for(int i = 0; i < n; i++){
//            if(arr[i] < 0){
//                ans[idx] = arr[i];
//                idx++;
//            }
//        }
//        for(int i = 0; i < n; i++){
//            System.out.print(ans[i] + " ");
//        }


//        System.out.println("Enter the size");
//        int n= scn.nextInt();
//        System.out.println("Enter array");
//        int arr[]=new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i]= scn.nextInt();
//        }
//        System.out.println("Entered array");
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]+" ");
//        }
//        Arrays.sort(arr);
//        System.out.println("Sorted Array");
//        for (int i = 0; i <n ; i++) {
//            System.out.println(arr[i]);
//
//        }
//        System.out.println("Enter k");
//        int k= scn.nextInt();
//        System.out.println(arr[k-1]);

        System.out.println("Enter size");
        int n = scn.nextInt();
        System.out.println("Enter array 1");
        int arr1[] = new int[n];
        System.out.println("Enter array 2");
        int arr2[] = new int[n];
        System.out.println("Entered array1");
        for (int i = 0; i < n; i++) {
            arr1[i]= scn.nextInt();
            System.out.println(arr1[i]);
        };

        System.out.println("Entered array2");
        for (int i = 0; i < n; i++) {
            arr2[i]=scn.nextInt();
            System.out.println(arr2[i]);
        };
        boolean ans = true;
        for (int i = 0; i < n; i++) {

            if (arr1[i] != arr2[i]) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);

    }
}
