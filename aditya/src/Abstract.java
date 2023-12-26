abstract class parent{
    public parent(){
        System.out.println("base ka constructor");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    public void greet2(){
        System.out.println("good evening");
    }
}
public class Abstract {
    public static void main(String[] args) {

        child obg=new child();
        obg.greet();
        obg.sayhello();
        obg.greet2();
    }
}
