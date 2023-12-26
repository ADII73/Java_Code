import java.util.Scanner;
public class methods_problems {
    static void multiplication(int n){
        for (int i=1; i<=10;i++){
            int result=0;
            result=n*i;
            System.out.printf("%d X %d = %d\n",n,i,result);
        }
    }
    static void pattern(int y){
        for (int i=0;i<y;i++){
            for (int j=0; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sum(int n){
        for (int i=1;i<=n;i++){
            int num;
            num= n*(n+1)/2;
            System.out.printf("The sum of first %d natural num = %d\n",n,num);
        }
        return n;
    }
    static int fib(int n){
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    static int avg(int...arr) {
        int result = 0;
        int average = 0;
        for (int element : arr) {
            result = (result + element);
            average = result / arr.length;
        }
        return average;
    }
    public static void main(String[] args) {
//        multiplication table

//        int c;
//        System.out.println("Enter the number:");
//        Scanner sc= new Scanner(System.in);
//        int a = sc.nextInt();
//        multiplication(a);

//        pattern
//
//        System.out.println("Enter the number:");
//        Scanner sc= new Scanner(System.in);
//        int a = sc.nextInt();
//        pattern(a);

//        sum of n natural numbers

//        System.out.println("Enter the number: ");
//        Scanner sc= new Scanner(System.in);
//        int a = sc.nextInt();
//        int c = sum(a);

//        fibonacci using recursion

//        int result=fib(6);
//        System.out.println(result);

        System.out.println(avg(34,34,32,23,66));
    }
}
