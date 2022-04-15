package tree;

import java.io.*;
//find level using recursion 
public class find_levelof_atree {
	static class Node{
        int data;
        Node left,right;
        
        Node(int data){
            this.data=data;
        }
    }
	static int levelOf_tree(Node root) {
		if(root==null)
			return 0;
		int lef=levelOf_tree(root.left);
		int rig=levelOf_tree(root.right);
		int max=Math.max(lef,rig);
		return max+1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(5);
        root.left=new Node(6);
        root.right=new Node(7);
        root.right.left=new Node(8);
        root.right.left=new Node(9);
        int res=levelOf_tree(root);
        System.out.println(res);

	}

}
