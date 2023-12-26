package JAVA;

public class sumofarrayelements {
    public static void main(String[] args) {
        int [] ages={25, 65,58,86,20};
        int sum=0;
        for (int i=0;i<ages.length;i++){
//            System.out.println(ages[i]);
           sum=sum+ages[i];
        }
            System.out.println(sum);
    }
}
