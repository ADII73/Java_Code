import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=9;
        marks[1]=4;
        marks[2]=9;
        Scanner sc=new Scanner(System.in);
        int ind = sc.nextInt();

        try{
            System.out.println("Welcome to intellij");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry");
                System.out.println("Exception in level 2");

            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");

        }
    }
}
