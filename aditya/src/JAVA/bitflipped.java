package JAVA;

public class bitflipped {
    public static void main(String[] args) {
        int x=10;
        int y=4; 
        int result=x^y;
        int ans=Integer.bitCount(result);
        System.out.println(ans);
    }
}
