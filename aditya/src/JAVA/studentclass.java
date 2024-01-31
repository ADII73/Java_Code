package JAVA;

public class studentclass {

    public static class student{
        String name;
        int age;
        double percent;
    }

    public static void change(student s){
        s.name="Professor";
    }
    public static void main(String[] args) {
        student x=new student();
        x.name="Aditya";
        x.age=20;
        x.percent=87;
        System.out.println(x.name);

        student y= new student();
        y.name="Berlin";
        y.age=21;
        y.percent=96;
        System.out.println(y.name);
        change(y);
        System.out.println(y.name);
    }
}
