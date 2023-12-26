public class methodoverloading {
    static void telljoke(){
        System.out.println("I created the world....");
    }
    static void foo(){
        System.out.println("Good Morning!!!!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+ a +" Boy!!");
    }
    static void foo(int a,int b,int c){
        System.out.println("Good Morning "+ a +" Boy!!");
        System.out.println("Good Morning "+ b +" Boy!!");
        System.out.println("Good Morning "+ c +" Boy!!");
    }
    public static void main(String[] args) {
        telljoke();
        foo();
        foo(7000);
        foo(3000,4000,5555);
        foo(5000,6000,3333);
    }
}
