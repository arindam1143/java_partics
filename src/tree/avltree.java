package tree;

public class avltree {




	static class Node{
		int data;
		Node left,right;
		int height;
		Node(int value){
			this.data=value;
			this.height=1;
		}
	}
	static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.left);
		return (1+Math.max(left,right));
	}
	static int findbalance(Node root) {
		int left=height(root.left);
		int right=height(root.right);
		return (left-right);
	}
	static Node leftrotation(Node root) {
		Node rootr=root.right;
		Node rootrl=root.right.left;
		
		rootr.left=root;
		root.right=rootrl;
		
		root.height=height(root);
		rootr.height=height(rootrl);
		
		return root;
		
		
	}
	static Node rightrotation(Node root) {
		Node rootl=root.left;
		Node rootlr=root.left.right;
	
		rootl.right=root;
		root.left=rootlr;
		
		root.height=height(root);
		rootl.height=height(rootl);
		
		return rootl;
		
	}
	//incerction and creation AVL Tree
	static Node insertionAVL(Node root,int data) {
		if(root==null) {
			return new Node(data);
		}
		if(data<root.data) {
			root.left=insertionAVL(root.left,data);
			
		}
		else if(data>root.data) {
			root.right=insertionAVL(root.right,data);
			}
		//update new height
		root.height=height(root);
		int balence=findbalance( root);
		if(balence <-1 && data>root.right.data ) {
			return leftrotation(root);
		}
		else if(balence <-1 && data<root.right.data) {
			root.right=rightrotation(root.right);
			return leftrotation(root);
		}
		else if(balence>1 && data<root.left.data) {
			return rightrotation(root);
		}
		else if(balence>1 && data>root.left.data) {
			root.left=leftrotation(root.right);
			return rightrotation(root);
		}
		else {
			return root;
			
		}
		 
		
	}
	static void inorder(Node root) {
		if(root==null) 
			return;
		
			
			inorder(root.left);
			System.out.println(root.data+" ");
			inorder(root.right);
		
	}
	

	public static void main(String[] args) {
	    
	
	Node root=insertionAVL(null,50);
    root=insertionAVL(root,60);
    root=insertionAVL(root,70);
    root=insertionAVL(root,40);
    root=insertionAVL(root,30);
     root=insertionAVL(root,140);
    root=insertionAVL(root,230);
    
    inorder(root);
    
	}

}




