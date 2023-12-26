package DataStructures;

public class movezeros {
    static void sort(int[]arr){
        for (int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (flag==false)
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr={0,5,0,3,42};
        sort(arr);
        for (int d:arr) {
            System.out.print(d+" ");

        }
    }
}
