class MyEmployee{
    private int id;
    private String name;

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
public class access_modifers {
    public static void main(String[] args) {

        MyEmployee aditya=new MyEmployee();
        aditya.setName("Berlin");
        aditya.setId(234);
        System.out.println(aditya.getName());
        System.out.println(aditya.getId());
    }
}
