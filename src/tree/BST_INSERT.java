package tree;

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
		root=insert(root,45);
		root=insert(root,100);
		inorder(root);
		
		

	}

}
