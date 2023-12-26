package DataStructures;

import java.util.Scanner;

public class findxelement {
    public int find(int[] arr ,int x){
        for (int i=1;i<arr.length;i++){
            if (arr[i]==x)
        return i;
        }
    return 1 ;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();

    }
}
