import java.util.Scanner;

public class breakk {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int x=sc.nextInt();

//        int num=1;
//        while (true){
//            if((num%5==0)&&(num%7==0)){
//                System.out.println("Found "+ num);
////                break;
//            }
//            num++;
//        }

//     for (int num=1;num<50;num++){
//         if (num%3==0){
//             continue;
//         }
//         System.out.println(num);
//        }

        int num=1;
        while (num<=50){
            if (num%3==0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
