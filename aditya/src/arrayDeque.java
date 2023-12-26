import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(65);
        ad1.add(56);
        ad1.addFirst(66666);
        ad1.addLast(6549889);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
