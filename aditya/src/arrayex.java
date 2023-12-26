import java.util.Scanner;

public class arrayex {

//    static void reverse(int[]arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            while(i<arr.length-1){
//                int temp=arr[i];
//                arr[i]=arr[arr.length-1];
//                arr[arr.length-1]=temp;
//            }
//
//
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter array: ");
        int []arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == k) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
//        for (int i =arr.length-1; i >=0 ; i--) {
////            arr[i]=arr.length-1;
//            System.out.print(arr[i]);
//        }
//        for (int i = 0; i <=arr.length ; i++) {
//            for (int j=0;j<=k;j++){
//                arr[k]
//            }

    }
}
