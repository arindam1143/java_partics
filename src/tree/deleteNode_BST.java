package tree;
import java.io.*;


public class deleteNode_BST {
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
	static void inorder(Node root) {
		if(root==null) 
			return;
		
			System.out.println(root.data+" ");
			inorder(root.left);
			inorder(root.right);
		
	}
	
	static int findSmall(Node root) {
		Node temp=root;
		while(temp.right !=null) {
			temp=temp.right;
		}
		return temp.data;
		
	}
	static Node deletNode(Node root,int val) {
		if(root==null) 
			return root;
			
			if(val<root.data) {
				root.left=deletNode(root.left,val);
			}
			else if(val>root.data) {
				root.right=deletNode(root.right,val);
			}
			else {
				if(root.left==null) {
					return root.right;
				}
				if(root.right==null) {
					return root.left;
				}
				else {
					root.data=findSmall(root);
					root.right=deletNode(root.right,root.data);
				}
			}
			return root;
		}
		
		
	
	public static void main(String[] args) {
		Node root=insert(null,40);
		root=insert(root,30);
		root=insert(root,47);
		root=insert(root,45);
		root=insert(root,100);
		inorder(root);
		root=deletNode(root,47);
		System.out.println("after delete node 47");
		inorder(root);
		
		

	}

}
