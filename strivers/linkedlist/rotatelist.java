public class rotatelist {
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
    public static Node findnthnode(Node head,int k){
        Node temp=head;
        int cnt=1;
        while(temp!=null){
            if(cnt==k)return temp;
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
    public static Node rotateright(Node head,int k){
        if(head==null||k==0){
            return head;
        }
        int len=1;
        Node tail=head;
        while(tail!=null){
            len++;
            tail=tail.next;
        }//ab len nikal gyi aur tail bhi nikal gyi
        if(k%len==0)return head;
        k=k%len;
        tail.next=head;//circular banadi
        Node newlastnode=findnthnode(head,len-k);
        head=newlastnode.next;
        newlastnode.next=null;
        return head;

    }
    public static void main(String[] args) {
        
    }
}
/*
 * 🔁 Example Input:
List: 1 → 2 → 3 → 4 → 5  
k = 2
🧠 Step-by-step Dry Run:
1️⃣ Check for base conditions:

if(head == null || k == 0) return head;
→ Not null and k = 2, so continue.

2️⃣ Calculate length of list:

int len = 1;
ListNode tail = head;
while(tail.next != null){
    len++;
    tail = tail.next;
}
Start: len = 1, tail = 1
After loop:
tail = 5, len = 5
3️⃣ Check if full rotation:

if(k % len == 0) return head;
k = 2, len = 5, 2 % 5 = 2, not 0 → continue.
4️⃣ Convert list into circular:

tail.next = head;
Now it becomes a circular linked list:

1 → 2 → 3 → 4 → 5 →
↑_________________|
5️⃣ Find new last node:

ListNode newlastnode = findNthNode(head, len - k);
len = 5, k = 2, so find 5 - 2 = 3rd node from start.
Call: findNthNode(head, 3)
cnt = 1 → 1
cnt = 2 → 2
cnt = 3 → 3 ✅ → return node(3)
6️⃣ Update head and break the circle:

head = newlastnode.next; // head = 4
newlastnode.next = null;
So head becomes node(4)
Break the circular link by setting 3.next = null
✅ Final Output:
4 → 5 → 1 → 2 → 3
🔄 Summary of Important Steps:
Find length of the list.
Make it circular by pointing tail to head.
Find new last node at position (len - k).
Set its next = null and update head.
📌 Note:
This approach ensures O(n) time and O(1) space complexity.

Want a visual diagram for this example or want to test it with a different k or list?




 */