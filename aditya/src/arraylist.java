import java.lang.reflect.Array;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>(5);
        l2.add(15);
        l2.add(25);
        l2.add(55);

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(0,1);
        l1.add(2,0);

        l1.addAll(0,l2);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,99);
//        l1.clear();
        for (int i=0;i< l1.size();i++){
            System.out.print (l1.get(i));
            System.out.print(", ");
        }


    }
}
