import java.util.Scanner;

public class unqiuenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = res ^ arr[i];

        }
        System.out.println(res);
    }
}

