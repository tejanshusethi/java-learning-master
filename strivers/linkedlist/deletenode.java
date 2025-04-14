import java.util.*;
public class deletenode {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
          this.data=data;
        }
    }
public static void deletenode(ListNode node){
    node.data=node.next.data;
    node.next=node.next.next;

}
// it works only when node in middle or starting it doesnot work in end 
    public static void main(String[] args) {
        LinkedList<Integer>ls=new LinkedList<>();
        ls.add(3);
        ls.add(5);
       System.out.print(ls+" ");
    }
}

/*
 * 237. Delete Node in a Linked List

There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
 */
