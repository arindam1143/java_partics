package tree;
import java.util.*;
import java.io.*;
public class BST_INSERT {
	static class Node{
		int data;
		Node left,right;
		Node(int val){
			this.data=val;
			this.left=null;
			this.right=null;
			
		}
		
	}
	static Node insert(Node root,int val) {
		if(root==null) {
			Node temp=new Node(val);
			return temp;
		}
		if(root.data>val) {
			root.left=insert(root.left,val);
			
		}
		else {
			root.right=insert(root.right,val);
			
		}
		return root;
		
	}
	//inorder treavesen(left-data-right)
	static void inorder(Node root) {
		if(root==null) 
			return;
		
			
			inorder(root.left);
			System.out.println(root.data+" ");
			inorder(root.right);
		
	}
	//preorder treavesel(data-lift-right)
	static void preorder(Node root) {
		if(root==null) 
			return;
		
		
		System.out.println(root.data+" ");	
			preorder(root.left);
			
			preorder(root.right);
		
	}
	
	//postorder travesel(lift-right-data)
	static void postorder(Node root) {
		if(root==null) 
			return;
		
		
			
			postorder(root.left);
			
			postorder(root.right);
			System.out.println(root.data+" ");
		
	}
	
	//search function in BST
	static int search(Node root,int data) {
		if(root==null) {
			return -1;
		}
		if(root.data==data)return 1;
		if(root.data>data) {
			return search(root.left,data);
		}
		else if(root.data<data){
			return search(root.right,data);
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=insert(null,40);
		root=insert(root,30);
		root=insert(root,47);
		root=insert(root,45);
		root=insert(root,100);
		inorder(root);
		preorder(root);
		postorder(root);
		int a=search(root,45);
		System.out.println(a);
		
		
		

	}

}
