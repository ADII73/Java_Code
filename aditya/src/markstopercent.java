import java.util.Scanner;

public class markstopercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter marks in subject 1: ");
        int a = sc.nextInt();
        System.out.println("Enter marks in subject 2: ");
        int b = sc.nextInt();
        System.out.println("Enter marks in subject 3: ");
        int c = sc.nextInt();
        System.out.println("Enter marks in subject 4: ");
        int d = sc.nextInt();
        System.out.println("Enter marks in subject 5: ");
        int e = sc.nextInt();

        int total=a+b+c+d+e;
        System.out.print("Total=");
        System.out.println(total);

        float percentage = (total/500.0f)*100;
        System.out.print("Percentage=");
        System.out.println(percentage);

    }
}
