import java.util.Arrays;
import java.util.Scanner;
public class countdistinct {

    static void printArray(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void distinct(int [] arr,int m){
        int count=0;
        for (int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) {
                count++;
                count++;
            }
        }
        System.out.println(count);
        if(count>=m){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter m: ");
        int m=sc.nextInt();
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array:"+" ");
        printArray(arr);
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
        System.out.print("Distinct number: ");
        distinct(arr,m);
    }
}
