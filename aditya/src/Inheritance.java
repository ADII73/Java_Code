class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am a constructor");
    }
}
class derived extends base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        System.out.println("I am in dervied setting y now");
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(4);
        System.out.println(b.getX());

        derived d=new derived();
        d.setX(43);
        System.out.println(d.getX());

        derived f=new derived();
        f.setY(65);
        System.out.println(f.getY());

    }
}
