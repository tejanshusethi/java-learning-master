public class detectcycle {
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
    public static boolean hascycle(Node head){
        Node fast=head;
        Node slow=head;
        if(head==null)return false;
        if(head.next==null)return false;
        while(fast!=null){
            if(slow==null)return false;
            slow=slow.next;
            if(fast.next==null)return false;
            fast=fast.next.next;
            if(fast==slow)return true;
        }
        return false;
    }//isme jab ghum ghumke fast slow ke bharbar hojaye toh smjhjana cycle hain vhape
    public static Node detectcyle(Node head){
        Node slow=head;
        Node fast=head;
        if(head==null)return null;
        if(head.next==null)return null;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Node temp=head;
                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;
                }
                return temp;//the starting node of the cycle
            }

        }
        return null;//if there is no cycle present 
    }

}
