import java.util.*;
public class oddevenlinkedlist {
    public static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
  public static   class SinglyLinkedList {
        Node head;
    
        // Add node to the end
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
    
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public Node oddevenlist(Node head){
        Node odd=new Node(0);
        Node even=new Node(0);
        Node tempo=odd;
        Node tempe=even;
        Node temp=head;
        while(temp!=null){
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;
            tempe.next=temp;
            if(temp==null)break;
            temp=temp.next;
            tempe=tempe.next;

        }
        odd=odd.next;
        even=even.next;
        tempo.next=even;
        return odd;
    }
    public static void main(String[] args) {
        
    }
}
