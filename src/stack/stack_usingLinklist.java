package stack;

import java.util.Scanner;
public class stack_usingLinklist {
    static class stackLL{
        class Node {
            int data;
            Node next;
        }
        Node top;
        stackLL(){
            top=null;
        }
        void push(int data){
            Node temp=new Node();
            temp.data=data;
            temp.next=top;
            top=temp;
        }
        boolean isempty(){
            if(top==null)
                return true;
                return false;
            
        }
        void pop(){
            if(top !=null){
            	System.out.println("your top is now "+top.data+" ");
                top=top.next;
            }
            else{
                System.out.println("stack is empty");
            }
        }
        int peek(){
            if(top !=null){
            	
                return top.data;
            }
            else{
                System.out.println("stack is empty");
                return 0;
            }
        }
        void print(){
            Node temp=top;
            while(temp !=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            }
        }
    
    
    public static void main (String[] args) {
        stackLL obj=new stackLL();
        obj.push(5);
       obj.push(4);
       obj.push(3);
       obj.push(2);
       obj.push(1);
       boolean b=obj.isempty();
       System.out.println("your stack is empty?? "+b);
       obj.pop();
       
      int a=obj.peek();
       System.out.println("your peek element is "+a);
       System.out.println("your stack is ");
       obj.print();
    }
}