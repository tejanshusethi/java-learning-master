// package linkedlist;

public class basics {
    public static void display(Node head){
        if(head==null)return;
        display(head.next);
        System.out.println(head.data+" ");

    }
    public static void insertatend(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;

    }
    public static class Node{
        int data;//value
        Node next;//address of next node
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(7);
        a.next=b;
        // System.out.println(a.next.data);
        Node temp=a;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
