import java.util.Scanner;

public class bubblesort {
    static void bubblesorts(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int teemp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=teemp;
                }
            }
        }
    }
    public static void main(String[] args) {
       int arr[]={5, 7, 4, 9, 3, 1,0};
       bubblesorts(arr);
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }

    }
}
