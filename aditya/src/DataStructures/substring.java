package DataStructures;
import java.util.*;
public class substring {
    public static void main(String[] args) {
        String str="abcd";
//        System.out.println(str.substring(2,4));
//        System.out.println(str.substring(2));
        for (int i=0;i<=3;i++){
            for (int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
