public class palindromelinkedlist {
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
    public static Node reverse(Node head){
        Node prev=null;
        Node agla=null;
        Node current=head;
        while(current!=null){
            agla=current.next;
            current.next=prev;
            prev=current;
            current=agla;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=reverse(slow.next);
        slow.next=temp;
        Node p1=head;
        Node p2=slow.next;
        while(p2!=null){
            if(p1.data!=p2.data)return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }

}
