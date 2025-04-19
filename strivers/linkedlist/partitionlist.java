public class partitionlist {
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
    public static Node partitionlist(Node head,int x){
       Node small=new Node(0);
       Node high=new Node(0);
       Node smallhead=small;
       Node highhead=high;
       while(head!=null){
        if(head.data<x){
            // iska mtlb small mein jayega
            smallhead.next=head;
            smallhead=smallhead.next;
        }else{
            highhead.next=head;
            highhead=highhead.next;
        }
        head=head.next;
       }
       highhead.next=null;
       smallhead.next=high.next;
       return small.next;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * ✅ Example Input:
List: 1 → 4 → 3 → 2 → 5 → 2  
x = 3
📌 Variables:
small → dummy node for list of values < x
high → dummy node for list of values >= x
smallhead, highhead → pointers to build the two lists
🧠 Step-by-step Dry Run:
Initial state:

small = 0 →
high = 0 →
smallhead = small
highhead = high
Start Traversing the List:

🔁 head = 1
1 < 3 → goes to small list
small: 0 → 1  
smallhead → 1  
🔁 head = 4
4 >= 3 → goes to high list
high: 0 → 4  
highhead → 4  
🔁 head = 3
3 >= 3 → goes to high list
high: 0 → 4 → 3  
highhead → 3  
🔁 head = 2
2 < 3 → goes to small list
small: 0 → 1 → 2  
smallhead → 2  
🔁 head = 5
5 >= 3 → goes to high list
high: 0 → 4 → 3 → 5  
highhead → 5  
🔁 head = 2
2 < 3 → goes to small list
small: 0 → 1 → 2 → 2  
smallhead → 2  
✂️ After Traversal
highhead.next = null;          // Cut off high list end
smallhead.next = high.next;    // Connect small list to high list
return small.next;             // Return head of new list
highhead.next = null stops any loop from forming
smallhead.next = high.next links small list to start of high list (skipping dummy node)
✅ Final Result:
small: 0 → 1 → 2 → 2  
high: 0 → 4 → 3 → 5  

Final merged list:  
1 → 2 → 2 → 4 → 3 → 5
🔄 Summary:
Used two dummy lists for separation
Traversed once → O(n) time
No extra space used for nodes → O(1) space
 */