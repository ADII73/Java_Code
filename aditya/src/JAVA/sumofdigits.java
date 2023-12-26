package JAVA;

public class sumofdigits {
    public static void main(String[] args) {
        int x=132;
        int sum=0;
        while (x>0){
            int a=x%10;
            sum=sum+a;
            x=x/10;
        }
        System.out.println(sum);
    }
}
