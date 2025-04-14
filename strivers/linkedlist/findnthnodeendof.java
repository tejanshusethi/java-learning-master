public class findnthnodeendof {
    public static Node nthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-n+1;//this is the formula for finding nth node from end their index
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;

    }
    public static Node nthNode2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }// this is another method to find nth node from last in one traversal 

    public static Node deleteNthFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        // agar manlo hume head node hi delete karna hain toh usme fast toh null hojaye
        // jiska mtlb hain ki vhi head node hain 
        if(fast==null){
            head=head.next;
            return head;
        }//head isliye return karna pada kiuki main mein changes ni ho rhe the 
        // and vhi same chiz show ho rhi thi toh hum return kardenge head ko toh sab shi hojeyga
        
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b= new Node(13);
        Node c= new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // 100 13 4 5 12 10 
        // Node q=nthNode2(a,2);
        // System.out.println(q.data);
        display(a);
        a=deleteNthFromEnd(a, 6);
        display(a);


    }
}
