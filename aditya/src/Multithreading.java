//class Mythread extends Thread{      (1) Thread by extending
//    @Override
//    public void run(){
//        while (true){
//        System.out.println("My thread is cooking running ");
//        System.out.println("I am happy");
//
//        }
//    }
//}class Mythread1 extends Thread{
//    @Override
//    public void run(){
//        while (true){
//        System.out.println("My thread 1 is chatting chatting ");
//        System.out.println("I am sad");
//
//        }
//    }
//}
class Mythread implements Runnable{
    public void run(){
        System.out.println("I am runnable interface");
    }
}
public class Multithreading {
    public static void main(String[] args) {
//        Mythread t1=new Mythread();
//        Mythread1 t2=new Mythread1();
//        t1.start();
//        t2.start();
        Mythread t1=new Mythread();
        Thread t=new Thread(t1);
        t.run();
    }
}
