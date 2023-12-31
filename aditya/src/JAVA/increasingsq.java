package JAVA;

import java.util.Scanner;

public class increasingsq {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int[] sorted(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int ans[] = new int[arr.length];
        int k = arr.length-1;
        while (left <= right) {
                if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                    ans[k--] = arr[left] * arr[left];
                    left++;
                } else {
                    ans[k--] = arr[right] * arr[right];
                    right--;
                }
            }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
        int ans[] = sorted(arr);
        System.out.println("Sorted array: ");
        printArray(ans);
    }
}
