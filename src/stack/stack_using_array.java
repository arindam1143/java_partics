package stack;
import java.io.*;

public class stack_using_array {
    static class stack{
    static int len=10;
    static int top;
    static int[] arr=new int[len];
    stack(){
        top=-1;
    }
    
    static boolean isempty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    
   static void push(int n){
       if(top>=(len-1)){
           System.out.println("stack overflow");
       }
       else{
           top++;
           arr[top]=n;
       }
       
       
   } 
   static void pop(){
       if(top==-1){
           System.out.println("stack underfolw");
       }
       else{
           top--;
       }
   }
   static int peek(){
       if(top==-1){
           return 0;
       }
       else{
           return arr[top];
       }
   }
   
   static void print(){
       for(int i=top;i>=0;i--){
           System.out.print(arr[i]+" ");
       }
   }
   
}
    
   public static void main (String[] args) {
       //int[] arr={1,5,8,70,10,50};
       //int len=arr.length;
       stack obj=new stack();
       int len=5;
       int[] arr=new int[len];
       obj.push(5);
       obj.push(4);
       obj.push(3);
      obj.push(2);
       obj.push(1);
       obj.isempty();
       //one time call pop function
       obj.pop();
       
       int a=obj.peek();
       System.out.println("your peek element is  "+a);
       System.out.println("your stack is  ");
       obj.print();
   } 
}

