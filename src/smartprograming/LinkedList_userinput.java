package smartprograming;
import java.util.Scanner;
public class LinkedList_userinput {
	static class Node{
        int data;
        Node next;
    }
     
        
    public static Node createLL(int n){
       Scanner input=new Scanner(System.in); 
       Node head=new Node();
       head.data=input.nextInt();
       head.next=null;
       Node temp=head;
       for(int i=1;i<n;i++){
           Node temp2=new Node();
           temp2.data=input.nextInt();
           temp.next=temp2;
           temp=temp2;
       }
       
       return head;
       
    }
    public static void display(Node head){
       Node temp=head;
       if(temp==null){
           System.out.println("your linked is empty");
       }
       else{
           while(temp !=null){
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
       }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
	       int n=obj.nextInt();
	       
	       Node head=createLL(n);
	       System.out.println(head);
	      
	       display(head);

	}

}
