package DataStructures;

public class bubblesort {
    static void bubblesort(int [] a){
        for (int i=0;i<a.length-1;i--){
            boolean flag=false;  //   no swap
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;   // some swap has happened
                }
            }
            if (flag==false){    // no swap
                return;
            }
        }
    }

    public static void main(String[] args) {
        int [] a={2,1,3,4,5};
        bubblesort(a);
        for (int i: a) {
            System.out.print(i+" ");

        }

    }
}
