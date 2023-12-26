package DataStructures;

import java.util.ArrayList;
import java.util.Collections;


public class arraylist2 {
    static void reverselist(ArrayList<Integer> list){
     int i=0,j=list.size()-1;
     while (i<j){

         Integer temp =Integer.valueOf(list.get(i));
         list.set(i,list.get(j));
         list.set(j,temp);
         j--;
         i++;
     }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(61);
        list.add(5);
        list.add(6);
        list.add(65);
        System.out.println("list before\n"+list);
        Collections.reverse(list);
//        reverselist(list);
        System.out.println("After reversing\n"+list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        ArrayList<String> li=new ArrayList<>();
        li.add("Aditya");
        li.add("Routh");
        li.add("Berlin");
        Collections.sort(li); //Ascending
        System.out.println(li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);
    }
}
