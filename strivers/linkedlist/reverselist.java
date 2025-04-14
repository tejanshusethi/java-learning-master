public class reverselist {
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
    public static Node reverselist(Node head){
        if(head==null)return null;
        if(head.next==null)return head;
        Node newhead=reverselist(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }//0(n) time complexity
    public static Node reverselist2(Node head){
        Node curr=head;
        Node prev=null;
        Node agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
    

}
/*
 * 📦 Example Input:
Let’s consider this linked list:

head -> 1 -> 2 -> 3 -> 4 -> null

📍Call 1: reverselist(1)
head = 1
→ Calls reverselist(2)

📍Call 2: reverselist(2)
   head = 2
→ Calls reverselist(3)
📍Call 3: reverselist(3)
head = 3
→ Calls reverselist(4)
📍Call 4: reverselist(4)
head = 4
head.next == null, so return 4
↩ Returns to Call 3
⬅ Backtrack Begins from Call 3
↩ Call 3 Resumes: (head = 3)
newhead = 4      // returned from below
head.next.next = head → 4.next = 3
head.next = null

List now:
4 → 3 → null
Return newhead = 4
↩ Call 2 Resumes: (head = 2)
newhead = 4
head.next.next = head → 3.next = 2
head.next = null

List now:
4 → 3 → 2 → null
Return newhead = 4
↩ Call 1 Resumes: (head = 1)
newhead = 4
head.next.next = head → 2.next = 1
head.next = null

List now:
4 → 3 → 2 → 1 → null
Return newhead = 4
✅ Final Output:
head = 4 → 3 → 2 → 1 → null

 */


 /*
  * 📦 Input Linked List:
head → 1 → 2 → 3 → 4 → null
💡 Dry Run Step by Step:
We will trace the variables:
curr, prev, and agla at each step of the while loop.

🔁 Iteration 1:
curr = 1
prev = null
agla = curr.next = 2

curr.next = prev → 1.next = null
prev = curr → prev = 1
curr = agla → curr = 2
✅ List so far:

1 → null
🔁 Iteration 2:
curr = 2
prev = 1
agla = curr.next = 3

curr.next = prev → 2.next = 1
prev = curr → prev = 2
curr = agla → curr = 3
✅ List so far:
2 → 1 → null
🔁 Iteration 3:
curr = 3
prev = 2
agla = curr.next = 4

curr.next = prev → 3.next = 2
prev = curr → prev = 3
curr = agla → curr = 4
✅ List so far:
3 → 2 → 1 → null
🔁 Iteration 4:
curr = 4
prev = 3
agla = curr.next = null

curr.next = prev → 4.next = 3
prev = curr → prev = 4
curr = agla → curr = null
✅ List so far:
4 → 3 → 2 → 1 → null
🛑 Loop ends (curr = null)
Function returns:
return prev;  // which is 4 → 3 → 2 → 1 → null

  */