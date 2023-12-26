interface camera{
    void takesnap();
    void recordvideo();
}
interface wifi{
    String []getnetworks();
    void connecttonetwork(String network);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling"+phonenumber);
    }
    void pickcall(){
        System.out.println("picking...");
    }
}
class smartphone extends mycellphone implements wifi,camera{
   public void takesnap(){
        System.out.println("Taking snap");
    }
    public   void recordvideo(){
        System.out.println("Recording...");
    }
    public  String []getnetworks(){
        System.out.println("Getting list of names");
        String [] networkslist={"Aditya","Berlin"};
        return networkslist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting yo"+network);
    }

}
public class Defaultmethods {
    public static void main(String[] args) {
        smartphone ms=new smartphone();
//        String[] arr= ms.getnetworks();
//        for (String item: arr) {
//            System.out.println(item);
//        }
        ms.takesnap();
    }
}
