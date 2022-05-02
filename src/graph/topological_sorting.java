package graph;

import java.util.Stack;
import java.util.Vector;

public class topological_sorting {
	static Stack<Integer> st=new Stack<>();
	
	static void dsf(int[][] graph,int node,boolean[]arr) {
		 
		arr[node]=true;
		for(int i=0;i<arr.length;i++) {
			if(graph[node][i]==1 && arr[i]==false) {
				dsf(graph,i,arr);
			}
		}
		st.push(node);
	}
	static void toposorting(int[][] graph) {
		
		int n=graph.length;
		boolean[] arr=new boolean[n];
		for(int i=0;i<n;i++) {
			if(arr[i]==false) {
				dsf(graph,i,arr);
			}
		}
		while(!st.isEmpty()) {
			int val=st.pop();
			System.out.println(val+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph= {
				{0,0,1,0,1},
				{0,0,0,1,1},
				{0,0,0,0,0},
				{0,0,0,0,0,},
				{0,0,0,0,0,}
		};
		toposorting(graph);
		

	}

}
