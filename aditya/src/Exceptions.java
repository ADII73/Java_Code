import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=9;
        marks[1]=4;
        marks[2]=9;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number to divide with");
        int num = sc.nextInt();
        try{
            System.out.println("The value at enterd index is"+marks[ind]);
            System.out.println("Divided number is"+ marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception error ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index error ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some error ");
            System.out.println(e);
        }

    }
}
