package JAVA;

public class linkedliststackimplement {

    public static  class Node{    // user defined data type
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class LLStack{  // user defined structure
        Node head=null;
        int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if (head==null){
                System.out.println("Stack empty");
                return -1;
            }
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if (head==null){
                System.out.println("Stack empty");
                return -1;
            }
            return head.data;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }



    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
        st.push(8);
        st.display();
        st.push(9);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());

    }
}
