import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array of "+n);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]);

        }
    }
}
