package tree;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
//given root and level 
//print the level no of node not using loop,queue 
//only usins recursion
public class printNodeof_level_notUsingQueue {
	 static class Node{
	        int data;
	        Node left,right;
	        
	        Node(int data){
	            this.data=data;
	        }
	    }
	    
	    static void print(Node root, int level){
	        if(root==null)
	        return;
	         if(level==1){
	            System.out.print(root.data+" ");
	        }
	        else if(level >1){
	            print(root.left,level-1);
	            print(root.right,level-1);
	        }
	    }
	    
	    
	    public static void main (String[] args) {
	        Node root=new Node(5);
	        root.left=new Node(6);
	        root.right=new Node(7);
	        root.right.left=new Node(8);
	        root.right.left=new Node(9);
	        print(root,2);
	    }

}
