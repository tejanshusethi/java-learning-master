public class deletemiddlenode {
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
    public static Node deleteMiddle(Node head){
        if(head==null||head.next==null)return null;
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // 12345
        // slow-2,3->slow.next
        slow.next=slow.next.next;
        return head;
    }
}
// 🔄 Dry Run (Odd length: 1 -> 2 -> 3 -> 4 -> 5)
// Step-by-step:
// Iteration	slow.val	fast.val	fast.next.next	fast.next.next.next	Condition	Action
// 1	1 → 2	1 → 3	3 (not null)	4 (not null)	✅	Move slow & fast
// 2	2 → 3	3 → 5	5 (not null)	null	❌	Exit loop
// Now:

// slow = 2

// So, slow.next = 3, slow.next.next = 4

// We remove the middle by:


// slow.next = slow.next.next; // Removes node 3