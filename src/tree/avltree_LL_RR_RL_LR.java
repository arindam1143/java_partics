package tree;
import java.util.*;

import java.io.*;

public class avltree_LL_RR_RL_LR {
	static class Node{
		int data;
		Node right,left;
		int hight;
		Node(int data){
			this.data=data;
		}
	}
	static int hight(Node root) {
		if(root==null) {
			return 0;
		}
		int l=hight(root.left);
		int r=hight(root.right);
		return (Math.max(l, r)+1);
	}
	static int balance(Node root) {
		int l=hight(root.left);
		int r=hight(root.right);
		return(l-r);
	}
	static Node insert(Node root,int val) {
		if(root==null)
			return new Node(val);
		if(root.data>val) {
			root.left=insert(root.left, val);
		}
		else if(root.data<val) {
			root.right=insert(root.right, val);
		}
			int bf=balance(root);
			int hight=hight(root);
			if(bf>1 && val<root.left.data) {
				return rotateleft(root);
			}
			else if(bf>1 && val>root.left.data) {
				root.left=rotateright(root.left);
				return root;
			}
			else if(bf<-1 && val<root.right.data) {
				root.right=rotateright(root.right);
			return rotateleft(root);
			}
			else if(bf<-1 && val>root.right.data) {
				return rotateleft(root);
			}
			
		return root;
		
	}
	static Node rotateright(Node root) {
		Node leftchild=root.left;
		Node rootleftright=leftchild.right;
		leftchild.right=root;
		root.left=rootleftright;
		
		return root.left;
		
	}
	static Node rotateleft(Node root) {
		Node rr=root.right;
		Node rrl=root.right.left;
		rr.left=root;
		root.right=rrl;
		return rr;
	}
	static void inorder(Node root) {
		if(root==null) 
			return;
		
			System.out.println(root.data+" ");
			inorder(root.left);
			inorder(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=insert(null,40);
		root=insert(root,30);
		root=insert(root,47);
		//root=insert(root,45);
		root=insert(root,100);
		inorder(root);
		

	}

}
//own
