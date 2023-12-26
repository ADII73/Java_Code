package DataStructures;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
//        Integer i =Integer.valueOf(4);
//        System.out.println(i);

        ArrayList<Integer> l1=new ArrayList<>();
//        ArrayList<Boolean> l1=new ArrayList<>();
//        ArrayList<Float> l1=new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

//        System.out.println(l1.get(1));
//        System.out.println(l1.get(0));

//        for (int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }

        System.out.println(l1);
        l1.add(2,5000);
        System.out.println(l1);
        l1.set(2,200);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);

        //removing an element without knowing index just knwing value
//        l1.remove(Integer.valueOf(7));
//        System.out.println(l1.remove(Integer.valueOf(7)));

        // checking if element exists or not
//        l1.contains(Integer.valueOf(10));
        System.out.println(l1.contains(Integer.valueOf(9)));

        ArrayList l=new ArrayList();
        l.add("Aditya");
        l.add(78);
        l.add(true);
        System.out.println(l);


    }
}
