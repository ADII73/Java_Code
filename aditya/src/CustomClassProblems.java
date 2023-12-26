class   Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
class cellphone{
    public void vibrating(){
        System.out.println("Vibrating......");
    }
    public void ringing(){
        System.out.println("Ringing......");
    }
    public void CallFriend(){
        System.out.println("Call Professor......");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class CustomClassProblems {
    public static void main(String[] args) {
        Employee aditya=new Employee();

        aditya.setName("Berlin");
        aditya.salary=45000;
        System.out.println(aditya.getName());
        System.out.println(aditya.getSalary());


        cellphone realme =new cellphone();
        realme.ringing();
        realme.vibrating();
        realme.CallFriend();

        square sq=new square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
