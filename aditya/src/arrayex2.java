import java.util.Scanner;
public class arrayex2 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n= sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr=new int[n];
        for (int i = 1; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for (int i = 1; i <n ; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(i);
                        temp = 1;
                        break;
                    }
                }
                if(temp==1) break;
        }
        if(temp==0){
            System.out.println("-1");
        }
    }
}

