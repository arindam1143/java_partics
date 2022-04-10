package smartprograming;
import java.util.Scanner;
import java.io.*;
public class reverslinkedlist {
	static class Node{
	       int data;
	       Node next;
	   } 
	   static Node createLL(int len){
	       Scanner obj=new Scanner(System.in);
	       Node head=new Node();
	       head.data=obj.nextInt();
	       head.next=null;
	       Node temp=head;
	       for(int i=1;i<len;i++){
	           Node temp2=new Node();
	           temp2.data=obj.nextInt();
	           temp.next=temp2;
	           temp=temp2;
	       }
	       return head;
	   }
	   static void display(Node head){
	       Node temp=head;
	       while(temp !=null){
	           System.out.print(temp.data+" ");
	           temp=temp.next;
	       }
	   }
	   static void reversLL(Node head){
	       Node temp=head;
	       if(temp.next==null){
	           System.out.print(temp.data+" ");
	           return;
	       }
	       reversLL(temp.next);
	       System.out.print(temp.data+" ");
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj1=new Scanner(System.in);
        int len=obj1.nextInt();
        Node head=createLL(len);
        display(head);
        System.out.println("revers linked is  ");
        reversLL(head);
	}

}
