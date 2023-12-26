import java.util.Scanner;
public class test {
    public static void printArray(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] positiveNegetive(int arr[]) {
        int countPos=0;
        int countNeg=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<0) {
                countNeg++;
            }
            else if(arr[i]>=0) {
                countPos++;
            }
        }
        int positive[]=new int[countPos];
        int negetive[]=new int[countNeg];
        int p=0;
        int n=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=0) {
                positive[p++]=arr[i];
            }
            else {
                negetive[n++]=arr[i];
            }
        }
        int k=0;
        int i=0;
        int j=0;
        int res[]=new int[arr.length];
        if(countNeg<countPos) {
            while(i<countNeg && j<countPos) {
                res[k++]=negetive[i++];
                res[k++]=positive[j++];
            }
            while(i<countNeg) {
                res[k++]=negetive[i++];
            }
            while(j<countPos) {
                res[k++]=positive[j++];
            }
        }
        else{
            while(j<countNeg && i<countPos) {
                res[k++]=positive[j++];
                res[k++]=negetive[i++];
            }
            while(i<countNeg) {
                res[k++]=negetive[i++];
            }
            while(j<countPos) {
                res[k++]=positive[j++];
            }
        }
        return res;
    }
    public static int[] createArray() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the number at "+i+" :");
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]=createArray();
        int res[]=positiveNegetive(arr);
        printArray(res);

    }

}
