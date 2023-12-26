class Basement{
    Basement(){
        System.out.println("I am a constructor");
    }
    Basement(int x){
        System.out.println("I am an overload constructor with  value x "+x);
    }
}
class Derived extends Basement{
    Derived(){
        System.out.println("I am an derived class constructor");
    }
    Derived(int x,int y){
        System.out.println("I am an overload constructor of derived with value y as  "+y);

    }

        }
public class ConstructorInheritance {
    public static void main(String[] args) {

        Basement b = new Basement();
        Derived d =new Derived();
    }
}
