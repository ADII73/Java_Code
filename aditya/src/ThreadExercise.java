class Mythread4 extends Thread{
     public void run(){
         while (true){
             try{
                 Thread.sleep(200);
             }
             catch (Exception e){
                 System.out.println(e);
             }
         System.out.println("Good Morning");
         }
     }
}
class Mythread3 extends Thread{
     public void run(){
         while (true){
             try{
             Thread.sleep(200);
             }
             catch (Exception e){
                 System.out.println(e);
             }
         System.out.println("Welcome");
         }
     }
}
public class ThreadExercise {
    public static void main(String[] args) {
        Mythread4 t=new Mythread4();
        Mythread3 t1=new Mythread3();
        t.start();
        t1.start();
    }
}
