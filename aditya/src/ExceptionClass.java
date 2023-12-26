import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        if (a<9){
            try{
            throw new  Myexception();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }

    }
}
