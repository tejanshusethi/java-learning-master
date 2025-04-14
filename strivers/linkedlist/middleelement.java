import java.util.*;
public class middleelement {
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
    public static int getleftmiddle(Node head){
           Node slow=head;
           Node fast=head;
           while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
           }
           return slow.data;
    }
    public static int getrightmiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
/*
 * Let’s take this sample Linked List:


List: 10 -> 20 -> 30 -> 40 -> 50 -> 60
Index:  0     1     2     3     4     5
🔹 getLeftMiddle() Dry Run (For even length: returns 1st middle)
j
while (fast != null && fast.next != null && fast.next.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
Iteration	slow.data	fast.data	fast.next	fast.next.next	Condition True?
1	10 → 20	10 → 30	20	30	✅
2	20 → 30	30 → 50	40	50	✅
3	30	50	60	null ❌	❌
Result: slow.data = 30
Returned Value: 30 (Left-middle)

🔹 getRightMiddle() Dry Run (For even length: returns 2nd middle)
j
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
Iteration	slow.data	fast.data	fast.next	Condition True?
1	10 → 20	10 → 30	20	✅
2	20 → 30	30 → 50	40	✅
3	30 → 40	50 → null	60	❌
Result: slow.data = 40
Returned Value: 40 (Right-middle)

🧠 Memory Tip:
Use fast.next.next != null → stops one step earlier, so slow lands on left middle.

Use fast.next != null → lets fast go to the end, so slow lands on right middle.


 */
