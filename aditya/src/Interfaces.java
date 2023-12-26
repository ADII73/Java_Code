interface  bicycle{
    int a =45;
    void applybreak(int decrement);
    void speedup(int increment);
}
interface  Hornbicycle{
//    int a =45;
    void blowhornk3g();
    void blowhornk();
}
class Avoncycle implements bicycle,Hornbicycle{
    public void applybreak(int decrement){
        System.out.println("Applying break");
    }
    public void speedup(int increment){
        System.out.println("Speedup");
    }
    void blowhorn(){
        System.out.println("Blow horn");
    }
   public void blowhornk3g(){
        System.out.println("jshshvhfj");
    }
   public void blowhornk(){
        System.out.println("fgsssfb");
    }

        }
public class Interfaces {
    public static void main(String[] args) {
        Avoncycle obj=new Avoncycle();
        obj.applybreak(1);
        // you can create property in interface
        System.out.println(Avoncycle.a);
        //you can modify the properies
        obj.blowhornk();
        obj.blowhornk3g();
    }
}
