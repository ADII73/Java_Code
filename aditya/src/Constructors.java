class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
         id=12;
         name="Andre De Fonnolisa";
    }
//    public MyMainEmployee(String myName,int myId){
//        id=myId;
//        name=myName;
//    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id =i;
    }
    public int getId(){
        return id;
    }

}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee aditya=new MyMainEmployee();
//        MyMainEmployee aditya=new MyMainEmployee("Professor",12);
        System.out.println(aditya.getId());
        System.out.println(aditya.getName());

    }
}
