public class FinallyBlock {
    public static int greet() {

        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End ");
        }
        return 0;
    }
         public static void main (String[]args){
         int k=  greet();
         System.out.println(k);
        }
}
