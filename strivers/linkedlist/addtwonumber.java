import java.util.*;
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
    public static Node add(Node l1,Node l2){
        int carry=0;
        // int val1=0;
        Node ans=new Node(-1);// Dummy head
        Node temp=ans;
        while(l1!=null||l2!=null||carry!=0){
            int val1=0;
            if(l1!=null){
               val1=l1.data;
               l1=l1.next;
            }
            int val2=0;
            if(l2!=null){
                val2=l2.data;
                l2=l2.next;
            }
            int sum=carry+val1+val2;
            int digit=sum%10;
            carry=sum/10;
            // add the digit to the result list
            temp.next=new Node(digit);
            temp=temp.next;
        }
        return ans.next;// Return the actual result (skip the dummy head)

    }
    public static Node addtwonumber(Node l1,Node l2){
        if(l1==null)return l2;
        if(l2==null)return l1;
        // add two reversed list
        // we have given reverse number i have to add and return added list
        Node ans=add(l1,l2);
        return ans;


    }
    public static void main(String[] args) {
        
    }
}
/*
 * nputs (l1, l2) are reversed → means we can add normally from left to right
Output is built in the same order → so we don’t need to reverse the result
Therefore: no reversing is needed at all!
 */
