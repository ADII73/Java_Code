package JAVA;
import java.util.*;
public class substring {
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(str.substring(0,5));   // 0 is strt index (includes) 5 is end index (excludes) i.e. it will print upto(5-1) index
        System.out.println(str.substring(2));   // it takes only one parameter and prints all from the given index

    }
}
