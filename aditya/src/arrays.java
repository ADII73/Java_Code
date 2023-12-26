public class arrays {
    public static void main(String[] args) {
//        int []marks;
//        marks=new int[5];
//        marks[0]=100;
//        marks[1]=1300;
//        marks[2]=102;
//        marks[3]=130;
//        marks[4]=10;
//

        int marks[]={12,12,12,12,1};
//        System.out.println(marks[4]);
//        System.out.println(marks.length);
////Array display(Array traversal)
//        for (int i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }
////        in reverse
//        for (int i = marks.length-1;i>=0;i--)
//        {
//            System.out.println(marks[i]);
//        }
//for each loop
        for (int element: marks)
        {
            System.out.println(element);
        }
    }
}
