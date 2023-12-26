class c1{
    int a=23;

    public int b=34;
    private int c=3242;
    protected int d=453;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
    class c2{

        public void meth2(){
            System.out.println();
        }
    }
public class AccessModifier {
    public static void main(String[] args) {

        c1 c=new c1();
        c.meth1();

        c2 x=new c2();
        x.meth2();

//        System.out.println(c1.c);


    }
}
