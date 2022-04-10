package tree;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
public class simpleTree_impelemnt {
	static int count=0;
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data=data;
		}
	}
	static void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	//find total no of leaf node
	static void  NoofLeafNode(Node root) {
		 
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			count++;
		
		NoofLeafNode(root.left);
		NoofLeafNode(root.right);
		
		
		
	}
	static void  fullNode(Node root) {
		 
		if(root==null)
			return;
		if(root.left !=null && root.right !=null)
			count++;
		
		fullNode(root.left);
		fullNode(root.right);
		
		
		
	}
	static void  halfNode(Node root) {
		 
		if(root==null)
			return;
		if((root.left !=null && root.right ==null) ||(root.left ==null && root.right !=null))
			count++;
		
		halfNode(root.left);
	    halfNode(root.right);
		
		
		
	}
	//level order treavesel
	static void levelorder(Node root) {
		Queue queue =new LinkedList();
		queue.offer(root);
		while(!queue.isEmpty()) {
			Node temp=(Node)queue.poll();
			System.out.println(temp.data);
			if(temp.left !=null)
				queue.offer(temp.left);
			if(temp.right !=null)
				queue.offer(temp.right);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple trevesel of a tree inorder
		
    Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.left.right=new Node(50);
    root.right.left=new Node(90);
    inorder(root);
   // NoofLeafNode(root);
   // System.out.println();
    //System.out.println(count+" is total no of leaf node");
    //fullNode(root);
   // System.out.println();
  //System.out.println(count+" is of full node");
    //halfNode(root);
    
     //System.out.println();
    //System.out.println(count+" is of half node");
  System.out.println();
    levelorder(root);
    
	}

}
