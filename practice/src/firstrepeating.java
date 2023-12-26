import java.util.Scanner;

public class firstrepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,arr[i]);
        }
        int a[]=new int[ans+1];
        for(int i=0;i<n;i++){
            a[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(a[arr[i]]>1)
                System.out.println(i+1);
            break;
        }
//        System.out.println(-1);

    }
}
