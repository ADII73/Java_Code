package JAVA;
import java.util.ArrayList;
import java.util.Collections;
public class arraylistsums {

    static void reverselist(ArrayList<Integer>list){
    int i=0,j=list.size()-1;
    while (i<j){
        Integer temp=Integer.valueOf(list.get(i));
        list.set(i,list.get(j));
        list.set(j,temp);
        i++;
        j--;
    }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(32);
        list.add(87);
        list.add(85);
        list.add(65);
        list.add(55);
        System.out.println("OG List "+list);
//        reverselist(list);
        Collections.reverse(list);
        System.out.println("RS List "+list);
        Collections.sort(list);
        System.out.println(list);

    }
}
