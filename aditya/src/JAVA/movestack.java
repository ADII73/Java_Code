package JAVA;

import java.util.*;
public class movestack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st =new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        Stack<Integer> rst =new Stack<>();   // new stack to cpy in
        while (st.size()>0){
            int x=st.peek();
            rst.push(x);
            st.pop();
        }
        System.out.println(rst);
        System.out.println(st);

        Stack<Integer> sst =new Stack<>();
        while (rst.size()>0){
            sst.push(rst.pop());
        }
        System.out.println(sst);
        System.out.println(rst);
    }

}
