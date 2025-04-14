
public class intersectionoftwolinkedlist {
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
    public static Node getintersection(Node heada,Node headb ){
       Node temp1=heada;
       Node temp2=headb;
       int length1=0;
       while(temp1!=null){
        length1++;
        temp1=temp1.next;
       }
       int length2=0;
       while(temp2!=null){
        length2++;
        temp2=temp2.next;
       }
       temp1=heada;
       temp2=headb;
       if(length1>length2){
        int steps=length1-length2;
        for(int i=1;i<=steps;i++){
            temp1=temp1.next;
        }
       }else{
        int steps=length1-length2;
        for(int i=1;i<=steps;i++){
            temp2=temp2.next;
        }
       }
       while(temp1!=temp2){
        temp1=temp1.next;
        temp2=temp2.next;
       }
       return temp1;

    }//first of all dono ki length ki nikalo
    // aur jonsi badi hain usme se dusre ki length gatado aur vha tak loop chalake 
    // dono ko barbar le aao fir jab tak intersection point ni milta tabh tak temp chalate rho 
    // increment the bigger list by m-n step where m is the length of big list
    // and n is length of smaller list
    public static void main(String[] args) {
        
    }
}
