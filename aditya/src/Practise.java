//abstract class pen{
//    abstract void write();
//    abstract void refill();
//        }
//
//        class foutntainpen extends pen{
//           public void write(){
//                System.out.println("Write");
//            }
//
//            @Override
//          public void refill() {
//                System.out.println("Refill");
//            }
//            void changenible(){
//                System.out.println("Change nible");
//            }
//        }

//interface basicanimal{
//    void eat();
//    void sleep();
//}
//class monkey{
//    void jump(){
//        System.out.println("Jump");
//    }
//    void bite(){
//        System.out.println("Bite");
//    }
//}
//
//class human extends monkey implements basicanimal{
//     public void eat(){
//         System.out.println("Eat");
//     }
//     public void sleep(){
//         System.out.println("Sleep");
//     }
//     void speak(){
//         System.out.println("Hello");
//     }
//
//}

abstract class telephone {
    abstract void ring();

  abstract    void lift();

    abstract void disconnect();

    class smartphone extends telephone {
        @Override
       public void ring() {
            System.out.println("Ringing");
        }

        @Override
       public void lift() {
            System.out.println("lifting");
        }

        @Override
       public void disconnect() {
            System.out.println("Disconnecting");
        }

        void call() {
            System.out.println("Calling");
        }
    }
}

public class Practise {
    public static void main(String[] args) {
//        foutntainpen fp=new foutntainpen();
//        fp.changenible();
//        fp.refill();
//        fp.write();

//        human hu=new human();
//        hu.eat();
//        hu.sleep();
//        hu.jump();
//        hu.bite();
//        hu.speak();
//
//        monkey mon=new human();
//        mon.bite();         //---> polymorphism bite and jump method in monkey class
//        mon.jump();
//        // mon.speak();   --> cannot call method ehich is in some other clss as refernce is subclss and object is superclass

//        smartphone smt =new smartphone();

    }
}
