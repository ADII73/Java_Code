package JAVA;
public class arraystackimplement {

    public static class Stack{
        int arr[]=new int[3];
        int idx=0;

        void push(int x){
            if(isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Empty array");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("Empty array");
            }
            int top =arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        void display(){
            for (int i = 0; i <=idx-1 ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(size()==0) return false;
            else return true;
        }

        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }

    }
    public static void main(String[] args) {

        Stack st=new Stack();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        st.push(3);
        System.out.println(st.isFull());
        st.push(7);
    }
}
