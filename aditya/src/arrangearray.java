import java.util.Scanner;

public class arrangearray {

    static int arrange(int []arr,int n){
        for (int i=0;i<n;i++){
            if(arr[i]<0 && arr[i+1]>0){
                arr[0]=arr[i];
            System.out.println(arr[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println("Enter array: ");
        int [] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        arrange(arr,n);
    }
}
