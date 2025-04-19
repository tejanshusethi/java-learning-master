public class removeduplicates {
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
        public static Node deleteduplicate(Node head){
            Node curr=head;
            Node prev=null;
            while(curr!=null){
                if(curr.next!=null&&curr.next.data==curr.data){
                    int val=curr.data;
                    while(curr!=null&&curr.data==val){
                        curr=curr.next;
                    }
                    if(prev!=null){
                        prev.next=curr;
                    }else{
                        head=curr;
                    }

                }
                else{
                    prev=curr;
                    curr=curr.next;
                }
            }
            return head;
        }

        public static void main(String[] args) {
            
        }
}
/*1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5

 * head = node(1)
curr = head
prev = null
🔁 Loop Begins:
1️⃣ curr = 1

curr.next.val = 2, not equal to curr.val = 1
❌ No duplicate
So, move prev = curr (1), curr = curr.next (2)
2️⃣ curr = 2

curr.next.val = 3, not equal to curr.val = 2
❌ No duplicate
Move prev = curr (2), curr = curr.next (3)
3️⃣ curr = 3

curr.next.val = 3, equal to curr.val = 3
✅ Duplicate detected
Store val = 3
Skip all 3s → curr = curr.next.next (4)
Now:

curr = 4, prev = 2
Set prev.next = curr → skip the 3s
List becomes: 1 -> 2 -> 4 -> 4 -> 5
4️⃣ curr = 4

curr.next.val = 4, equal to curr.val = 4
✅ Duplicate detected
Store val = 4
Skip all 4s → curr = 5
Now:

prev = 2
curr = 5
prev.next = curr → skip the 4s
List becomes: 1 -> 2 -> 5
5️⃣ curr = 5

curr.next = null, no duplicate
❌ No duplicate
Move prev = 5, curr = null
⛔ Exit loop and return head
✅ Final Output:
1 -> 2 -> 5

 */
