package JAVA;

import java.util.Scanner;

public class togglecharstringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i=0;i<str.length();i++){
            boolean flag=true;    // capital character
            char ch=str.charAt(i);
            if(ch==' ') continue;

            int ascii= (int) ch;
            if(ascii>=97) flag =false ;   // gretaer than 97 then obviously small letter

            if(flag==true){       // small letter
                 ascii+=32;
                 char dh=(char)ascii;
                 str.setCharAt(i,dh);   // change the small letter to capital letter
            }
            else {
                ascii-=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }
         }
        System.out.println(str);
    }
}
