package DataStructures;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        System.out.println("Enter the elements of array");
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.next();
        }
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

