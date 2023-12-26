import java.util.Scanner;

//class student{
//    int roll_number=1;
//    String name ="aads";
//
//}
class area{
    int length ,breadth;
    public area(int l ,int b){
         length =l;
         breadth =b;

    }
    public int getarea(){
        return  length*breadth;
    }
    class perimeter{
        public int getparameter(){
            return (2*(length+breadth));
        }

    }

}
public class OOPS_Exercise {
    public static void main(String[] args) {
//        student s =new student();
//        System.out.println(s.name);
//        System.out.println(s.roll_number);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breadth");
        int b = sc.nextInt();
        System.out.println();
        area A= new area(l,b);
        System.out.println("Area="+ A.getarea());






    }
}
