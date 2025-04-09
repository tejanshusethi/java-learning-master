

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertatend(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
              
            }
            tail=temp;
            size++;
        }
        void display(){
            Node temp=head;
           while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
           }
        }
        // int size(){
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }
        void insertAthead(int val){
            Node temp=new Node(val);
            if(head==null){
                // head=temp;
                // tail=temp;
                insertatend(val);
            }else{//non - empty list
               temp.next=head;
               head=temp;
            }
            size++;
        }
        void insertat(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
                insertatend(val);
                return;
            }
            else if(idx==0){
                insertAthead(val);
                return;
            }
            else if(idx<0||idx>size){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getat(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                if(temp==null||temp.next==null){
                    return -1;
                    // System.out.println("element not");
                }
                temp=temp.next;
            }
            
            return temp.data;
        }
        void deleteat(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
              temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
            tail=temp;
        }

        

    }

    public static void main(String[] args) {
        linkedlist l1=new linkedlist();
       
        // l1.size(); 
        l1.insertatend(4);
        l1.insertatend(5);
        l1.display();
        // l1.size();
        System.out.println(l1.getat(3));
        l1.insertAthead(100);
        l1.display();

    }
    
}
