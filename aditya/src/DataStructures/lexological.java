package DataStructures;
public class lexological {
    static void lex(String[] s){
        for (int i=0;i<s.length-1;i++){
            int min_index=i;
            for (int j=i+1;j<s.length;j++){
                if (s[j].compareTo(s[min_index])<0){
                    min_index=j;
                }
            }
                    String temp=s[i];
                    s[i]=s[min_index];
                    s[min_index ]=temp;
        }
    }
    public static void main(String[] args) {
        String[] s={"Berlin","Professor","Nairobi","Tokyo","Rio","Oslo","Moscow","Denver"};
        lex(s);
        for (String m: s) {
            System.out.print(m+" ");

        }
    }
}
