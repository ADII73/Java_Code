package JAVA;

public class nthnodefromlast {

    public static Node nthnode(Node head,int idx){
        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-idx+1;
        temp=head;
        for (int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    public static Node nthnode2(Node head, int n){        // in one traversal
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow= slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static Node deletenthnode(Node head,int idx){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a= new Node(100);
        Node b= new Node(13);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

//        Node q =nthnode2(a,4);
//        System.out.println(q.data);
        display(a);
        a=deletenthnode(a,6);
        display(a);
    }
}
