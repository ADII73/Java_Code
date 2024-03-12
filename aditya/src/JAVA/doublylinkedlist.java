package JAVA;

import javax.management.StandardEmitterMBean;

public class doublylinkedlist {

    public static class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
            this.data=data;
        }
    }

    public static void displayrev(Node tail){   // display reverse
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.previous;
        }
        System.out.println();
    }

    public static void display(Node head){    // displlay
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void display2(Node random){    // display list using random node;
        Node temp=random;
        while(temp.previous!=null){
            temp=temp.previous;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertathead(Node head,int x){
        Node t =new Node(x);
        t.next=head;
        head.previous=t;
        head=t;
        return head;
    }

    public static void insetatidx(Node head,int idx,int x){
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next.previous=t;
        t.previous=temp;
        t.next=temp.next;
        temp.next=t;
    }
    public static void main(String[] args) {

        Node a =new Node(4);
        Node b =new Node(10);
        Node c =new Node(2);
        Node d =new Node(99);
        Node e =new Node(13);

        a.previous=null;
        a.next=b;
        b.previous=a;
        b.next=c;
        c.previous=b;
        c.next=d;
        d.previous=c;
        d.next=e;
        e.next=d;
        e.previous=d;
        e.next=null;

//        display(a);
//        displayrev(e);
        display2(b);
        Node newhead=insertathead(a,36);
        display(newhead);
        insetatidx(a,3,90);
        display(a);

    }
}
