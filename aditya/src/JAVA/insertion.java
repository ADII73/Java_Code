package JAVA;

import java.util.Stack;

public class insertion {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        int idx=0 , x=10;

        Stack<Integer> ist =new Stack<>();
        while(st.size()>idx){
            ist.push(st.pop());
        }
        st.push(x);

        while (ist.size()>0){
            st.push(ist.pop());
        }
        System.out.println(st);
        System.out.println(ist);
    }
}
