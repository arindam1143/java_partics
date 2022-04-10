/**
 * 
 */
/**
 * @author ADMIN
 *
 */
package smartprograming;
 public class Linkedlist{

static void prin(Node first){
    //Node head=first;
    Node temp=first;
    while(temp != null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
}

 static class Node{
    int data;
    Node next;
    
}
    public static void main(String args[]){
        
        Node first=new Node();
       
        //System.out.println(first);
        first.data=50;
        first.next=null;
        
        Node secend=new Node();
        secend.data=20;
        secend.next=null;
        first.next=secend;
        
        Node tird=new Node();
        tird.data=45;
        tird.next=null;
        secend.next=tird;
         prin(first);
        
       System.out.println(first); 
       System.out.println(first.data); 
       System.out.println(secend); 
       System.out.println(first.next); 
       System.out.println(secend.data); 
       System.out.println(tird); 
       System.out.println(tird.data); 
       System.out.println(secend.next);
       System.out.println(first.next.next);
       System.out.println(tird.next); 
       System.out.println(first.next.next.next); 
        
        
        
    }
}