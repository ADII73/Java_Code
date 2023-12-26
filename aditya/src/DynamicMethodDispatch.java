class Phone{
    public void showtime(){
        System.out.println("Showtime is 8");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Music on...");
    }
    public void on(){
        System.out.println("Turning on smartphone...");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj=new Phone();
//        Smartphone smobj=new Smartphone();
//        obj.name();
          Phone obj= new Smartphone(); //reference of superclass= object of subclass. (Reverse is not applicable) if new is written then it is on runtime

        obj.showtime(); // can be called as refernce is of superclass
        obj.on();  // Method overiding me obj will run .(Jiska oject hai wo run hoga)
        //obj.music();  cannot be called


    }
}
