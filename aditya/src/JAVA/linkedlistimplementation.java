package JAVA;

public class linkedlistimplementation {

    public static class Node{    // creating node of linked list
        int data;
        Node next;

        Node(int datas){
            this.data= datas;
        }
    }

    public static class linklist{              // creating data structure linkedlist like array strings...
        Node head=null;
        Node tail=null;
        int size=0;
        void insertatend(int value){               // function to insert at end of linked list
            Node temp=new Node(value);
            if(head==null){
                head=temp;

            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

        void insertatbegin(int value){      // insert at beginning
            Node temp =new Node(value);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void display(){       // display linkedlist
            Node tempo=head;
            while (tempo!=null){
                System.out.print(tempo.data+" ");
                tempo=tempo.next;
            }
            System.out.println();
        }

//        int size(){                  // this ois O(n) to improve we will write size++ at every end of method of inserion;
//                                        // then we wont be needing this function and then it will run on O(1)
//            Node temp=head;
//            int count=0;
//            while (temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
//        }
        void insertAt(int idx, int value){          // insert at any index
            Node t=new Node(value);                 // of there is index 4 st tail and called insertAt(5,76) it will add the element but tail will not move to the end
            Node temp=head;   // creating new node to iterate
            if (idx==size){
                insertatend(value);                // this will move tail to the end
                return;
            }
            // problem arises when want to insert at 0th index for that

            else if (idx==0) {
                insertatbegin(value);
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }

        int getAt(int idx){         // to get element at index
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){      // delete at given index
            Node temp=head;          // but if we delete at last index the last index will remove but tail still points to last index and that index points to null
            if(idx==0){
                head=head.next;// if we delete at strting index
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }
    }
    public static void main(String[] args) {

        linklist ll=new linklist();
        ll.insertatend(5);
        ll.display();
        ll.insertatend(6);
        ll.display();
        ll.insertatend(7);
        ll.display();
        ll.insertatbegin(12);
        ll.display();
        ll.insertAt(2,91);
        ll.display();
        System.out.println(ll.getAt(2));
        System.out.println(ll.size);
        ll.deleteAt(0);
        ll.display();
        ll.deleteAt(0);
        ll.display();


    }
}
