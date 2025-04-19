
import javax.swing.text.DefaultStyledDocument;

public class reverselinkedlist {
    public class addtwonumber {
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
        public static Node reversebetween(Node head,int left,int right){
            if(head==null||head.next==null||left==right){
                return head;
            }
            Node curr=head;
            Node prev=null;
            int i=1;
            while(curr!=null&&i!=left){
                prev=curr;
                curr=curr.next;
                i++;
            }//yha pe curr left pe poch gyi aur prev use piche
            Node pointtostart=prev;//yani ki left prev ko poiint karega
            Node start=curr;//iska mtlb ye left wale ko point karega
            prev=null;//iska mtlb ab prev jo tha usko null pe kardiya
            while(curr!=null&&i!=right+1){
                Node agla=curr.next;
                curr.next=prev;
                prev=curr;
                curr=agla;
                i++;
            }
            start.next=curr;
            if(pointtostart!=null){
                pointtostart.next=prev;
            }else{
                return prev;//if left is indexed then it will become new head
            }
            return head;

        }
    public static void main(String[] args) {
        
    }
}
}

/*
 * 🧪 Example:
Input Linked List: 1 → 2 → 3 → 4 → 5
left = 2, right = 4

That means we want to reverse 2 → 3 → 4 into 4 → 3 → 2

🔁 After reversal part:
prev points to 4 (new head of reversed sublist)
curr points to 5 (node after the reversed sublist)
start is still 2 (which is now last node of reversed part)
pointtostart is 1 (node before the reversed part)
tep-by-step:
start.next = curr
→ 2.next = 5
→ This links the last node of reversed part to the remaining list
→ Now reversed sublist looks like: 4 → 3 → 2 → 5

pointtostart.next = prev
→ 1.next = 4
→ This connects the first part (1) to the reversed sublist
Final list becomes:
1 → 4 → 3 → 2 → 5
Return head (1) because we didn't reverse from the start.



🔄 If left == 1, for example: left = 1, right = 3
Input: 1 → 2 → 3 → 4 → 5
Reverse from 1 to 3 → 3 → 2 → 1 → 4 → 5

Here:

pointtostart == null (no node before 1)
So prev = 3 is the new head after reversal
Hence,

return prev; // new head of the list


 */