package JAVA;

public class searchinarray {
    public static void main(String[] args) {
        int arr[]={4,65,9,1,9};
        int x=9;
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println(ans);

    }
}
