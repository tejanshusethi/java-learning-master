public class copylistwithrandompointer {
    public static class Node {
        int data;
        Node next;
        Node random;
    
        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
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
    public static Node copyrandomlist(Node head){
        // create a deep copy
        if(head==null)return null;
        Node head2=new Node(0);
        Node temp2=head2;
        Node temp1=head;
        // creating a deep copy
        while(temp1!=null){
            Node t=new Node(temp1.data);
            temp2.next=t;
            temp2=t;
            temp1=temp1.next;
        }
        head2=head2.next;
        temp2=head2;
        temp1=head;
        // alternate connection
        Node temp=new Node(-1);
        while(temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        temp2=head2;
        temp1=head;
        // assignigng random pointers
        while(temp1!=null&&temp2!=null){
            if(temp1.random==null)temp2.random=null;
            else{
                temp2.random=temp1.random.next;
            }
            temp1=temp1.next.next;
            if(temp1!=null)temp2=temp2.next.next;
        }
        temp2=head2;
        temp1=head;
        // seperating the linked list
        while(temp1!=null&&temp2!=null){
            temp1.next=temp2.next;
            temp1=temp1.next;
            if(temp1==null)break;
            temp2.next=temp1.next;
            if(temp2.next==null)break;
            temp2=temp2.next;
        }
        return head2;
    }
    public static void main(String[] args) {
        
    }
}
