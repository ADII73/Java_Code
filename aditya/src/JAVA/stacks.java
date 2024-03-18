package JAVA;

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {

        Stack<Integer> st =new Stack<>();
        // push operstion
        st.push(5);     // last element
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);     // first element inserted acc to stck principle

        // peek(returns the element that is  on top);
        System.out.println(st.peek());
        System.out.println(st);
//        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());

    }
}
