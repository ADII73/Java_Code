import java.util.Scanner;

public class practiceset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        byte m1 ,m2, m3;
//        System.out.println("Enter marks in Physics-");
//        m1=sc.nextByte();
//        System.out.println("Enter marks in Chemistry-");
//        m2=sc.nextByte();
//        System.out.println("Enter marks in Biology-");
//        m3=sc.nextByte();
//
//        float avg=(m1+m2+m3)/3f;
//
//        System.out.println("Your percentage is:" +avg);
//
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("Congratulations");
//
//        }
//        else
//        {
//            System.out.println("Better luck next time");
//        }


//        float tax;
//        float salary;
//        System.out.println("Enter the salary:");
//        salary=sc.nextFloat();
//
//        if (salary>=250000f && salary<=500000f)
//        {
//            System.out.println("5% tax is viable");
//            tax= (float) (0.05 * salary);
//            System.out.println("Tax paid is " + tax);
//        }
//        else if(salary>=500000f && salary<=1000000f)
//        {
//            System.out.println("20% tax is viable");
//            tax= (float) (0.2 * salary);
//            System.out.println("Tax paid is " + tax);
//        }
//        else if (salary>1000000f)
//        {
//            System.out.println("30% tax is viable");
//            tax= (float) (0.3 * salary);
//            System.out.println("Tax paid is " + tax);
//        }


//        int week;
//
//        System.out.println("Enter the number for the day");
//        week = sc.nextInt();
//
//        switch (week) {
//
//            case 1:
//                System.out.println("It is Monday");
//                break;
//            case 2:
//                System.out.println("It is Tuesday");
//                break;
//            case 3:
//                System.out.println("It is Wednesday");
//                break;
//            case 4:
//                System.out.println("It is Thursday");
//                break;
//            case 5:
//                System.out.println("It is Friday");
//                break;
//            case 6:
//                System.out.println("It is Saturday");
//                break;
//            case 7:
//                System.out.println("It is Sunday");
//                break;
//
//        }

//        int year;
//        int rem4;
//        int rem100;
//        int rem400;
//
//        System.out.println("Enter the 4 digits of a year, e.g. 1990: ");
////        Scanner sccc = new Scanner(System.in);
//        year = sc.nextInt();
//
//        rem4 = year % 4;
//        rem100 = year % 100;
//        rem400 = year % 400;
//
//        if (rem100==0 & rem400!=0){
//
//            System.out.println("Year " + year + " is not a leap year.");
//        }
//
//        else if (rem4==0){
//            System.out.println("Year " + year + " is a leap year.");
//        }

        System.out.println("Enter the website:");
        String website;
        website=sc.next();

        if (website.endsWith(".org"))
        {
            System.out.println("organisational website");

        }
        else if (website.endsWith(".in"))
        {
            System.out.println("Indian website");

        }

        else if(website.endsWith(".com"))
        {
            System.out.println("Indian website");

        }
    }
}
