package DataStructures;

public class pallindrome {
    public static void main(String[] args) {
        String str="abccbaee";
//        StringBuilder gtr= new StringBuilder(str);
//        gtr.reverse();
//        String s=gtr +"";
//        if(str.equals(s)){
//            System.out.println("pallindrome");
//        }
//        else {
//            System.out.println("not");
//        }

        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if (flag==true) System.out.println("palllindrome");
        else System.out.println("not");
    }
}
