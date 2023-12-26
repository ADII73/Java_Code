public class var_args {
    static int sum(int...arr){
        int result=0;
        for (int element:arr) {
            result +=element;
         }
        return result;
        }
    public static void main(String[] args) {

        System.out.println("Sum is"+ sum(1 ,2));
        System.out.println("Sum is "+ sum(1 ,2,3));
    }
}
