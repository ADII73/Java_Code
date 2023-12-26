package JAVA;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

//        // get element at index 1
//        System.out.println(l1.get(0)); // 5
//
        // print with loop
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
//
//        // print directly
//        System.out.println(l1);

        // adding element at index i
        l1.add(1,1000);
        System.out.println(l1);

        // modify at index i
        l1.set(1,5000);
        System.out.println(l1);

        // remove at index i
        l1.remove(1);
        System.out.println(l1);

        // remove element e
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);

        // check if element exists
        boolean ans=l1.contains(Integer.valueOf(7));
        System.out.println(ans);
    }
}
