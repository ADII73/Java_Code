import java.util.Scanner;

public class arrayexercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" Elements");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]-arr[i]==x){
                    System.out.println("yes");
                    return;
                }
             }
        }
        System.out.println("no");
    }

}
