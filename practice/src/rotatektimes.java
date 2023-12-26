import java.util.Scanner;

public class rotatektimes {

    static int[] arr(int arr[],int k){
        k=k%arr.length;
        int ans[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<arr.length-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k=sc.nextInt();
        int ans[]=arr(arr,k);
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
