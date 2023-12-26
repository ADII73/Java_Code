import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {

        System.out.println("Enter your age-");
        int age;
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();

        switch(age){

            case 18:
                System.out.println("You are adult");
                break;

            case 21:
                System.out.println("Ready for job");
                break;

            case 60:
                System.out.println("Retired");
                break;

            default:
                System.out.println("Enjoy your life");
        }

    }
}
