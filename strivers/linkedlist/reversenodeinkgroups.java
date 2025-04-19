public class reversenodeinkgroups {
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
    public static Node reversekGroup(Node head,int k){
        if(head==null||k==1){
            return head;
        }
        // count the numbers of node in the list
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        // reverse nodes in the group of k
        if(count<k){
            return head;//if there are fewer than k nodes,return head as it is 
        }
        Node prev=null;
        Node next=null;
        Node current=head;
       int i=0;
    //    reverse first k nodes
    while(i<k&&current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
        i++;
    }
        // Step 3: Recursively call reverseKGroup for the remaining list
        if(next!=null){
            head.next=reversekGroup(next, k);
        }
        // return the new head of the reversed ggroup
        return prev;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * 🧠 Pehle Basic Samajh lo:
Jab hum k nodes reverse karte hain, to:

head pehla node hota hai group ka (original linked list ka),
Jab group reverse ho jata hai to head last ban jata hai us group ka.
Jaise:

Original:    1 -> 2 -> 3 -> 4 -> 5
Group:       [1 -> 2] -> 3 -> 4 -> 5

After reverse:
             2 -> 1 -> 3 -> 4 -> 5
🔍 Ab Detail mein samjho:
head.next = reverseKGroup(next, k);
Jab 1 aur 2 reverse hue → ab 2 → 1 ban gaya.
1 ab last node hai is group ka.
Aur uske baad ka part (3 → 4 → 5) recursively reverse karna hai.
➡️ So we set:

head.next = reverseKGroup(next, k)
Matlab:

head (i.e. 1) ko connect karo us result se jo aayega recursive reverse se (jaise 4 → 3 → 5).
🤔 prev return kyun?
Jab aap k nodes reverse kar lete ho:

prev ban jata hai naya head us reversed group ka.
Example:

Before:      1 -> 2 -> 3 -> 4 -> 5

Reverse:     2 -> 1  (prev = 2, current = 3)

Return:      2
So prev is head of reversed list, that's why we return it.

1. Reverse k nodes → 2 → 1
2. Call recursion on rest → reverseKGroup(3 → 4 → 5)
3. Connect: 1.next = result of recursion
4. Return `prev` (2) as new head of this reversed group

 */
