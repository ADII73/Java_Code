import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> myhash=new HashSet<>(6,0.5f) ;
        myhash.add(6);
        myhash.add(8);
        myhash.add(10);
        myhash.add(1011);
        myhash.add(10);
        System.out.println(myhash);
    }
}
