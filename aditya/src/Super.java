class ekclass{
    int s;


    public int getS() {
        return s;
    }

    ekclass(int v){
        this.s=v;
    }
    class doclass extends ekclass{
        doclass(int c){
            super(c);
            System.out.println("I am a constructor");
        }
    }
    public int returnone(){
        return 1;
    }
}
public class Super {
    public static void main(String[] args) {
        ekclass e =new ekclass(5);
        System.out.println(e.getS());


    }
}
