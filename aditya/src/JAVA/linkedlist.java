package JAVA;

public class linkedlist {

    public static int length(Node head){    // length of linked list
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data;   //  to store the data
        Node next;  // to store the address of the next node

        Node(int data){      // constructor
            this.data=data;
        }
     }
    public static void main(String[] args) {
        Node a=new Node(55);
        Node b=new Node(95);   // creating 5 nodes a b c d e  and storing data
        Node c=new Node(5);
        Node d=new Node(53);
        Node e=new Node(15);

        a.next=b;                    // storing address of node b in node a in next
//        System.out.println(b.data);  // getting data of b from node b itself
//        System.out.println(a.next.data); // getting data of node b from node a as they are now connected(a.next stores address of b and . data will give the data of b)
        b.next=c;
        c.next=d;
        d.next=e;     // now all the nodes are connected we can access any node using any node

//        Node temp=a;
//        for (int i=1;i<=5;i++){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

        System.out.println(length(a));
    }
}
