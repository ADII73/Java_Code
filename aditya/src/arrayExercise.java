import static java.lang.Math.floorDiv;

public class arrayExercise {
    public static void main(String[] args) {

//        sum of arrays

//        float [] marks ={43.5f,34.5f,34.4f,33.4f,34.8f};
//        float sum=0;
//
//        for (float element: marks){
//            sum=sum+element;
//        }
//        System.out.println("Sum is "+ sum);
//
////        check number is present or not
//        float num = 34343.8f;
//        boolean isInArray=false;
//        for (float element:marks){
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray)
//        System.out.println("YES");
//
//        else{
//            System.out.println("NO");
//        }


//        avg of all students from an array using for each loop;

//        float [] marks ={43.5f,34.5f,34.4f,33.4f,34.8f};
//        float sum=0;
//            for (float element:marks)
//                sum=sum+element;
//        System.out.println("Average is "+sum/marks.length);


//        add two matrices of size (2,3)

        int[][] mat1={{1,2,3},
                      {4,5,6}};
//        int[][] mat2={{7,8,9},
//                      {1,1,2}};
//        int[][] result={{0,0,0},
//                        {0,0,0}};
//
//        for (int i=0;i<mat2.length;i++){          //row number of times
//            for (int j=0;j<mat2[i].length;j++){   //column number of times
//                result[i][j]= mat1[i][j]+ mat2[i][j];
//                System.out.print(result[i][j] + " ");
//;            }
//                System.out.println("");
//    }

//        array reversal

//        int[]arr={1,2,3,4};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for (int i=0;i<n;i++){
////            swapping
//            temp=arr[l-i-1];
//            arr[l-i-1]=arr[i];
//            arr[i]=temp;
//        }
//        for(int elment:arr)
//            System.out.println(elment);

        int[]arr={23,43,567600,324200,2342};
        int max=0;          //we can also use. int max=INTEGER.MAX_VALUE and MAX_VALUE
        for (int e:arr)
        {
            if (e>max){
                max=e;
            }
        }
                System.out.println(max);
    }
}
