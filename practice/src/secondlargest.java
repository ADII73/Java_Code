import java.util.Scanner;

public class secondlargest {

    static int findmax(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static int findsecondmax(int arr[]){
        int max1=findmax(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==max1) arr[i]= Integer.MIN_VALUE;
        }
        int found2ndmax=findmax(arr);
        return found2ndmax;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second max is: ");
        System.out.println(findsecondmax(arr));



        //OPTIMIZED CODE

//        int first=arr[0];
//        int second=-1;
//        for(int i=1;i<n;i++){
//            if(arr[i]>first){
//                second=first;
//                first=arr[i];
//            }
//            else if(arr[i]<first && arr[i]>second){
//                second=arr[i];
//            }
//        }
//        return second;

    }
}
