package JAVA;

public class bubblesort {

    static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
        boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=true;
                }

            }
            if (flag==false){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int [] a={5,3,1,8,9,0};
        bubble(a);
        for (int i:a) {
            System.out.print(i+" ");

        }

    }
}
