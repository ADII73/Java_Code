import java.util.Scanner;
public class arrayexercise3 {

    static int pairsum(int arr[],int target){
        int ans=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] +arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;

    }

    static int unique(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
            ans=arr[i];
            }
        }
        return ans;
    }

    static int findmax(int []arr){
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    static int secndmax(int arr[]){
        int mx=findmax(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=findmax(arr);
        return secondmax;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter sizeof array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" Elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


//        System.out.println("Enter target sum");
//        int target=sc.nextInt();
//
//        System.out.println(pairsum(arr,target));

//        System.out.println(unique(arr));
        System.out.println(secndmax(arr));
    }
}
