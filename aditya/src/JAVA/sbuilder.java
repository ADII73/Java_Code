package JAVA;
import java.util.*;
public class sbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        str.append("world");     // to add strings
        System.out.println(str);
        str.setCharAt(0,'M');   // to change character of string which cannot be done in strings but in stringBuilder
        System.out.println(str);

        str.insert(2,'y');   // to insert character at index
        System.out.println(str);

        str.deleteCharAt(2);
        System.out.println(str);    // to delete the ch at index

        StringBuilder s=new StringBuilder("Aditya");
        System.out.println(s);
        s.reverse();    // to reverse
        System.out.println(s);

        s.reverse();
        s.delete(1,4);   // to delete characters from i to j
        System.out.println(s);
    }
}
