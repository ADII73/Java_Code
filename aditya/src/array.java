class demo{
    void arra(){
    int []age=new int[6];
    int ages[]={1,6,8,8,85,5};
    float [] weig=new float[9];
    String []name=new String[6];

        System.out.println(ages[1]);

    age[0]=1;
    age[1]=5;
    age[2]=4;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
    }

    void max(){
        int arr[]={1,7,3,8,63,65};
        int ans=0;
        for (int i=0;i<arr.length;i++){
            if(ans<arr[i]){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }

    void search(){
        int [] ele={56,665,6,8,9,665};
        int x=665;
        int ans=-1;
        for (int i=0;i< ele.length;i++){
            if(x==ele[i]){
                ans=i;
                break;
            }
        }
                System.out.println("true");
                System.out.println(x + " at " +ans );
    }
    void multi(){

//        int [][] mul=new int [5][3];
        int [][] mul1={{54,26,85},{56,85,2},{10,3}};
//        System.out.println(mul1[0][0]);
//        System.out.println(mul1[0][1]);
//        System.out.println(mul1[0][2]);
//        System.out.println(mul1[1][0]);
//        System.out.println(mul1[1][1]);
//        System.out.println(mul1[1][2]);
//        System.out.println(mul1.length);
        for (int i=0;i<mul1.length;i++){
            for (int j=0;j< mul1[i].length;j++){
                System.out.println(mul1[i][j]);
            }

        }

    }
}

public class array {
    public static void main(String[] args) {
        demo obj=new demo();
//        obj.arra();
//        obj.multi();
//        obj.max();
        obj.search();

        System.out.println(1/10);
        System.out.println(1%4);
    }
}
