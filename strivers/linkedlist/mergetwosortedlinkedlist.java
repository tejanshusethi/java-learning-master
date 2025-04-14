public class mergetwosortedlinkedlist {
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
    public static Node mergeList(Node list1,Node list2){
        Node temp1=list1;
        Node temp2=list2;
        Node head=new Node(100);//ye isliye banyi ki easy hojata but return hm head ka agla wala bhejdenge
        Node temp=head;
        while(temp1!=null&&temp2!=null){
            if(temp1.data<temp2.data){
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }else{
                Node a =new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            } 
        }
        if(temp1==null){
            temp.next=temp2;
        }else{
            temp.next=temp1;
        }
        return head.next;
    }//isme extra linked list banani padi hain iska 0(N)
    public static Node mergelist2(Node list1,Node list2){
        Node t1=list1;
        Node t2=list2;
        Node h=new Node(100);
        Node t=h;
        while(t1!=null&&t2!=null){
            if(t1.data<t2.data){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t.next=t2;
        }else{
            t.next=t1;
        }
        return h.next;
    }

}
/*
 * et’s assume:

list1 = 1 -> 4 -> 6  
list2 = 2 -> 3 -> 5
🧠 Dry Run (VS Code Style)
// Initialization:


t1 = 1 -> 4 -> 6
t2 = 2 -> 3 -> 5
h = 100 -> null  // Dummy node
t = h
🌀 First Iteration:

t1.val (1) < t2.val (2)
t.next = t1         // h -> 1
t = t1              // t -> 1
t1 = t1.next        // t1 -> 4
🌀 Second Iteration:

t1.val (4) > t2.val (2)
t.next = t2         // h -> 1 -> 2
t = t2              // t -> 2
t2 = t2.next        // t2 -> 3
🌀 Third Iteration:

t1.val (4) > t2.val (3)
t.next = t2         // h -> 1 -> 2 -> 3
t = t2              // t -> 3
t2 = t2.next        // t2 -> 5
🌀 Fourth Iteration:

t1.val (4) < t2.val (5)
t.next = t1         // h -> 1 -> 2 -> 3 -> 4
t = t1              // t -> 4
t1 = t1.next        // t1 -> 6
🌀 Fifth Iteration:

t1.val (6) > t2.val (5)
t.next = t2         // h -> 1 -> 2 -> 3 -> 4 -> 5
t = t2              // t -> 5
t2 = t2.next        // t2 -> null
📌 Loop Ends (t2 is null)
if (t1 == null) ❌
else → t.next = t1
=> t.next = 6
🧾 Final Merged List (h.next):
1 -> 2 -> 3 -> 4 -> 5 -> 6

 */

